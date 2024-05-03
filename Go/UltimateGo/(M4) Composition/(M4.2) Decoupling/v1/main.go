package main

import (
	"errors"
	"fmt"
	"io"
	"math/rand"
	"time"
)

// Data is the structure of the data we are copying
type Data struct {
	Line string
}

// Xenia is a system we need to pull data from
type Xenia struct {
	Host    string
	Timeout time.Duration
}

// Pull knows how to pull data out of Xenia
func (*Xenia) Pull(d *Data) error {
	switch rand.Intn(10) {
	case 1, 9:
		return io.EOF
	case 5:
		return errors.New("Error reading data")
	default:
		d.Line = "Data"
		fmt.Println("In:", d.Line)
		return nil
	}
}

// Pillar is a system we need to store data into
type Pillar struct {
	Host    string
	Timeout time.Duration
}

// Store knows how to store data into Pillar
func (p *Pillar) Store(d *Data) error {
	fmt.Println("Out:", d.Line)
	return nil
}

// System wraps Xenia and Pillar together into a single system
type System struct {
	Xenia
	Pillar
}

// pull knows how to pull bulks of data from Xenia
func pull(x *Xenia, data []Data) (int, error) {
	for i := range data {
		err := x.Pull(&data[i])
		if err != nil {
			return i, err
		}
	}
	return len(data), nil
}

// store knows how to store bulks of data into Pillar
func store(p *Pillar, data []Data) (int, error) {
	for i := range data {
		err := p.Store(&data[i])
		if err != nil {
			return i, err
		}
	}
	return len(data), nil
}

func Copy(sys *System, batch int) error {
	data := make([]Data, batch)

	for {
		i, err := pull(&sys.Xenia, data)
		if i > 0 {
			_, err := store(&sys.Pillar, data)
			if err != nil {
				return err
			}
		}
		if err != nil {
			return err
		}
	}
}

func main() {
	sys := System{
		Xenia: Xenia{
			Host:    "localhost:8080",
			Timeout: time.Second,
		},
		Pillar: Pillar{
			Host:    "localhost:9090",
			Timeout: time.Second,
		},
	}

	err := Copy(&sys, 3)
	if err != io.EOF {
		fmt.Println(err)
	}
}

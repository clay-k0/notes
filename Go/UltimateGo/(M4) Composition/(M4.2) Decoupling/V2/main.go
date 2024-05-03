package main

import (
	"errors"
	"fmt"
	"io"
	"math/rand"
	"time"
)

// Data represents the structure of the data we are copying.
type Data struct {
	Line string
}

// Puller is an interface defining the method to pull data.
type Puller interface {
	Pull(d *Data) error
}

// Storer is an interface defining the method to store data.
type Storer interface {
	Store(d *Data) error
}

// Xenia represents a system from which data is pulled.
type Xenia struct {
	Host    string
	Timeout time.Duration
}

// Pull implements the Pull method for Xenia, simulating data retrieval with random errors.
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

// Pillar represents a system where data is stored.
type Pillar struct {
	Host    string
	Timeout time.Duration
}

// Store implements the Store method for Pillar, logging the operation.
func (p *Pillar) Store(d *Data) error {
	fmt.Println("Out:", d.Line)
	return nil
}

// pull attempts to pull data into a slice of Data from a Puller, handling errors.
func pull(p Puller, data []Data) (int, error) {
	for i := range data {
		err := p.Pull(&data[i])
		if err != nil {
			return i, err
		}
	}
	return len(data), nil
}

// store attempts to store a slice of Data into a Storer, handling errors.
func store(s Storer, data []Data) (int, error) {
	for i := range data {
		err := s.Store(&data[i])
		if err != nil {
			return i, err
		}
	}
	return len(data), nil
}

// Copy orchestrates the pulling and storing of data between a Puller and a Storer.
func Copy(p Puller, s Storer, batch int) error {
	data := make([]Data, batch)

	for {
		i, err := pull(p, data)
		if i > 0 {
			_, err := store(s, data[:i])
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
	x := Xenia{
		Host:    "localhost:8080",
		Timeout: time.Second,
	}

	p := Pillar{
		Host:    "localhost:9090",
		Timeout: time.Second,
	}

	err := Copy(&x, &p, 3)
	if err != io.EOF {
		fmt.Println(err)
	}
}

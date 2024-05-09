package main

import (
	"crypto/sha1"
	"fmt"
	"runtime"
	"strconv"
	"sync"
)

func init() {
	runtime.GOMAXPROCS(1)
}

// printHashes calculates the sha1 hash for a range
// of numbers and prints each in hex encoding
func printHashes(prefix string) {
	// change the range to 10 and 50000 to see the scheduler behavior
	for i := 1; i < 50000; i++ {
		// convert i to a string
		num := strconv.Itoa(i)

		// calculate hash for string num
		sum := sha1.Sum([]byte(num))

		// Print prefix: 5-digit-number: hex encoded hash
		fmt.Printf("%s: %05d: %x\n", prefix, i, sum)
	}

	fmt.Println("Completed", prefix)
}

func main() {
	// wg is used to manage concurrency
	var wg sync.WaitGroup
	wg.Add(2)

	fmt.Println("starting goroutines")

	// create a goroutine and manage its lifecycle
	go func() {
		printHashes("A")
		wg.Done()
	}()

	// create a goroutine and manage its lifecycle
	go func() {
		printHashes("B")
		wg.Done()
	}()

	// wait for the goroutines to finish
	fmt.Println("\ndone starting, waiting to finish:")
	wg.Wait()

	fmt.Println("\nfinished, terminating")
}

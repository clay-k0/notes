package main

import (
	"fmt"

	"github.com/clay-k0/example2/counters"
)

func main() {
	// attempt to store our non-exported type in a variable
	counter := counters.alertCounter(47)

	// ./example2.go:11:22: undefined: counters.alertCounter

	fmt.Printf("Counter: %d\n", counter)
}

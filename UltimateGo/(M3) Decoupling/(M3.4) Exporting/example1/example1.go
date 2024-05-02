package main

import (
	"fmt"

	"github.com/clay-k0/example1/counters"
)

func main() {
	// create a variable of the exported type
	counter := counters.AlertCounter(47)

	fmt.Printf("Counter: %d\n", counter)
}

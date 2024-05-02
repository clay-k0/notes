package main

import (
	"fmt"

	"github.com/clay-k0/example3/counters"
)

func main() {
	// create a variable holding the unexported type by using the
	// exported New function
	counter := counters.New(47)

	fmt.Printf("Counter: %d\n", counter)
}

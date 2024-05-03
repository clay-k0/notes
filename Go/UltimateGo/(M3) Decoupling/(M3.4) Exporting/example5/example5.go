package main

import (
	"fmt"

	"github.com/clay-k0/example5/users"
)

func main() {
	// create a value of type Manager
	u := users.Manager{
		Title: "Dev Manager",
	}

	// set the exported fields from the non-exported user type
	u.Name = "Clay"
	u.ID = 123

	fmt.Printf("User: %v\n", u)
}

package main

import (
	"fmt"

	"github.com/clay-k0/example4/users"
)

func main() {
	// attempt to create user from exported and non-exported User type(s)
	u := users.User{
		Name: "Clay",
		ID:   123,

		password: "password",
	}

	// ./example4.go:15:3: unknown field password in struct literal of type users.User

	// attempt to print user info
	fmt.Printf("User: %v\n", u)
}

package main

import "fmt"

type user struct {
	name  string
	email string
}

func main() {
	userV1 := createUserV1()
	userV2 := createUserV2()

	fmt.Printf("from main | userV1: %v\n", &userV1)
	fmt.Printf("from main | userV2: %v\n", &userV2)
}

// value semantic factory function
func createUserV1() user {
	u := user{
		name:  "Clay",
		email: "Clay@email.com",
	}
	fmt.Printf("from V1 | u: %v\n", &u)

	return u
}

// pointer semantic construction function
func createUserV2() *user {
	u := user{
		name:  "Clay",
		email: "Clay@email.com",
	}
	fmt.Printf("from V1 | u: %v\n", &u)

	return &u
}

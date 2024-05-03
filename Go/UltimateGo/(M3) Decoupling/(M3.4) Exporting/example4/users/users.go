package users

// exported User type representing user info
type User struct {
	// exported fields
	Name string
	ID   int

	// non-exported field
	password string
}

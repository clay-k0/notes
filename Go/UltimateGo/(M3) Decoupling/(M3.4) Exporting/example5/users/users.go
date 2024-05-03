package users

// non-exported user type represents user info
type user struct {
	Name string
	ID   int
}

// exported Manager type embeds a non-exported user
type Manager struct {
	Title string

	user
}

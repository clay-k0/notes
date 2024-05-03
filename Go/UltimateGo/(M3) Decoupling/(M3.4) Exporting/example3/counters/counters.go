package counters

// non-exported name type containing an int counter for alerts
type alertCounter int

// Note: we don't write the following in real Go code
// New creates and returns values of the non-exported type alertCounter
func New(value int) alertCounter {
	return alertCounter(value)
}

## Interfaces: Method Sets and Address of Value

### Going Further

Let's create another polymorphic program and introduce some new ideas:

```go
package main

import "fmt"

// notifier is an interface that defines notification type behavior
type notifier interface {
	notify()
}

// user defines a user in the program
type user struct {
	name string
	email string
}

// notify implements the notifier interface with a pointer receiver
func (u *user) notify() {
	fmt.Printf("Send User Email To %s<%s>\n", u.name, u.email)
}

// sendNotification accepts a value that implements the notifier 
// interface and sends notifications
func sendNotification(n notifier) {
	n.notify()
}

func main() {
	u := user{"Clay", "clay@email.com"}

	// because the values of type user use pointer semantics,
	// they do not implement the notifier interface
	sendNotification(u)

	// Therefore, we get an error:
	// cannot use u (variable of type user) as notifier value in argument to
	// sendNotification: user does not implement notifier 
	// (method notify has pointer receiver)
}
```

The error we receive is a helpful gesture,  but why does it happen? The answer is the method set rules defined by Go.

### Method Set Rules/Address of Value

Let's take a look at the method set rules defined the Go spec:

| Type                 | Result                                                       |
| -------------------- | ------------------------------------------------------------ |
| A value (i.e `user`) | _Only_ value receivers can attach                            |
| An address (`*user`) | _Both_ pointer and value receivers can attach to the address |
If we look at this in terms of behavior, the picture becomes clearer: 

Values only support value receivers because we can't always assume its address can be obtained. However, how come both pointer/value receivers can be used with addresses? Well, behavior-wise, we should generally use pointer receivers to share, but when it comes to value receivers, we use them in the aforementioned cases of `Decode` or `Unmarshal`.

Therefore, we now know that

```go
sendNotification(u)
```

made a _copy_ of the user. In order the program to compile successfully, we need to pass the user as a pointer:

```go
sendNotification(&u)
```

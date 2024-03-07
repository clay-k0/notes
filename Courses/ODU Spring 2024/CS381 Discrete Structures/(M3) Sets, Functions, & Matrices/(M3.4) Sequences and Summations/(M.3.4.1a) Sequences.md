- - -
## Sequence

**The Simple Definition:**
- A sequence is an **ordered list** of elements like
	- 1,2,3,4
	- 1,2,3,5,8...
	- 1,3,10,90...
	- 5,6,7,10
- It is a set of elements with a **pattern**
- Sequences are either **finite** or **infinite**
- Sequences are important in mathematics, computer science (analysis of algorithms, data structures, string handling, etc.).

**The Formal Definition:**
- A sequence is a **function** from a subset of the integers (usually either the set $\{0,1,2,3,4,\dots\}$ or $\{1,2,3,4,\dots\}$ to a set $S$)
- The notation $a_{n}$ is used to denote the image of the integer $n$
- We can think of $a_{n}$ as the equivalent of $f(n)$ where $f$ is a function from $\{0,1,2,\dots\}$ to $S$
- We call $a_{n}$ a **term** of the sequence.

**Example**
What is the sequence $\{a_{n}\}$ where $a_{n}=\frac{1}{n}$

**Solution:**
$\{a_{1},a_{2},a_{3},\dots\}$
$=1, \frac{1}{2}, \frac{1}{3}, \frac{1}{4}, \dots$

- - -
## Special Sequences

1. Geometric Progression
2. Arithmetic Progression
3. Strings
4. Recurrence Relations
5. Fibonacci Sequence

- - -
## Geometric Progression
**Definition:** A geometric progression sequence has the form $a,ar,ar^2,\dots,ar^n,\dots$ where the initial term $a$ and the common ratio $r$ are a real numbers.

**Examples:**
1. Let $a=1$ and $r=-1$. Then:
	$\{b_{n}\}=\{1,-1,1,-1,1,\dots\}$

2. Let $a=2$ and $r=5$. Then:
	$\{c_{n}\}=\{2,10,50,250,1250\}$


3. Let $a=6$ and $r=\frac{1}{3}$. Then:
	$\{d_{n}\}=\{ 6,2, \frac{2}{3}, \frac{2}{9}, \frac{2}{27}\}$

- - -
## Arithmetic Progression
**Definition:** An arithmetic progression is a sequence of the form $a,a+d,a+2d,\dots,a+nd$ where the initial term $a$ and the common difference $d$ is a real number.

**Examples**:
1. Let $a=-1$ and $r=4$. Then:
	$\{a_{n}\}=\{-1,3,7,11,15,\dots\}$

2. Let $a=7$ and $r=-3$. Then:
	$\{b_{n}\}=\{7,4,1,-2,-5,\dots\}$


3. Let $a=1$ and $r=2$. Then:
	$\{c_{n}\}=\{1,3,5,7,9,\dots\}$

- - -
## Strings
**Definition**: A string is a finite sequence of characters from a finite set (an alphabet)

- Sequences of characters or bits are important in computer science
- The empty string is usually represented by $\lambda$
- The string 'abcde' has length of 5

- - -
## Recurrence Relations

- A recurrence relation for the sequence $\{a_{n}\}$ is an equation that expresses $a_{n}$ in terms of one or more of the previous terms of the sequence
- A sequence is called a **solution** of a recurrence relation if its terms satisfy the recurrence relation
- The initial conditions for a sequence specify the terms that precede the first terms where the recurrence relation takes effect

**Example 1:**
Let $\{a_{n}\}$ be a sequence that satisfies the recurrence relation $a_{n}=a_{n-1}+3$ for $n=1,2,3,4,\dots$ and suppose that $a_{0}=2$. What are the values of $a_{1}, a_{2},$and $a_{3}$?

**Solution**
$\{a_{0}\}=2$
$\{a_{1}\}=5$
$\{a_{2}\}=8$
$\{a_{3}\}=11$

**Example 2**
Let $\{a_{n}\}$ be a sequence that satisfies the recurrence relation $a_{n}=a_{n-1}-a_{n-2}$ for $n=2,3,4,\dots$ and suppose that $a_{0}=3$. What are the values of $a_{2}$ and $a_{3}$?

**Solution**
$\{a_{2}\}=2$
$\{a_{3}\}=-3$

### Solving Recurrence Relation
- By finding a formula for the $nth$ term of the recurrence relation
- Such a formula is called a **closed formula**

#### Iterative Solution Example
**Method 1**
- Working upward, **forward** substitution
- Let $\{a_{n}\}$ be a sequence that satisfies the recurrence relation $a_{n}=a_{n-1}+3$ for $n=2,3,4,\dots$ and suppose that $a_{1}=2$

$a_{2}=2+3$
$a_{3}=(2+3)+3=2+3 *2$
$a_{4}=(2+2*3)+3=2+3*3$

Therefore, $a_{n}=a_{n-1}+3=(2+3*(n-2))+3=2+3(n-1)$

**Method 2**
- Working downward, **backward** substitution
- Let $\{a_{n}\}$ be a sequence that satisfies the recurrence relation $a_{n}=a_{n-1}+3$ for $n=2,3,4,\dots$ and suppose that $a_{1}=2$

$a_{n}=a_{n-1}+3$
$=(a_{n-2}+3)+3=a_{n-2}+3*2$
$=(a_{n-3}+3)+3*2=a_{n-3}+3*3$

Therefore, $a_{2}+3(n-2)=(a_{1}+3)+3(n-2)=2+3(n-1)$

- - -
## Fibonacci Sequence
- The Fibonacci sequence is a sequence of the form $f_{0},f_{1},f_{2},\dots$ where any number in the sequence is found by adding up the two numbers before it
- Foruma: $f_{n}=f_{n-1}+f_{n-2}$
- It is a recurrence relation

**Example**
Assume a Fibonacci sequence with initial conditions $f_{0}=0, f_{1}=1$. Find the values of the Fibonacci sequence $f_{2},f_{3},f_{4},f_{5},$ and $f_{6}$

**Solution**
$f_{0}=0$
$f_{1}=1$
$f_{2}=1$
$f_{3}=2$
$f_{4}=3$
$f_{5}=5$
$f_{6}=8$

### Useful Sequences

![[useful_sequences.png]]

- - -

## Financial Application

Suppose that a person deposits $10,000.00 in a savings account at a bank yielding 11% per year with interest compounded annually. How much will be in the account after 30 years.

Let $P_{n}$ denote the amount in the account after 30 years. $P_{n}$ satisfies the following recurrence relation:
$P_{n}=P_{n-1}+0.11P_{n-1}=(1.11)P_{n-1}$ with the initial condition $P_{0}=10,000$.

**Solution**

$P_{1}=(1.11)P_{0}$
$P_{2}=(1.11)P_{1}$
$P_{3}=(1.11)P_{2}$
$\vdots$
$P_{n}=(1.11)P_{n-1}=(1.11)^nP_{0}=(1.11)^n*10,000$

$P_{n}=(1.11)^n*10,000$ (Can prove by induction, covered later in Chapter 5)
$P_{30}=(1.11)^30*10,000=$**$228,992.97**








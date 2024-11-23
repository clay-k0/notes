## TEST 2 REVIEW

### Problem 1

Consider the set of vectors $S$, where $\vec{u_{1}}=\begin{bmatrix}1\\1\\0\end{bmatrix},~\vec{u_{2}}=\begin{bmatrix}1\\1\\1\end{bmatrix},$ and $\vec{u_{3}}=\begin{bmatrix}1\\0\\1\end{bmatrix}$

**(a)** Show that $S$ is a _basis_ for $R^3$
**(b)** Find $\begin{bmatrix}0\\1\\-1\end{bmatrix}_{S}$

#### Solution

**(a)** Remember, to show $S$ is a _basis_,

1. The set must be _L.I._
2. $\text{dim}S=\text{dim}R^3$

To check for L.I., form a matrix, then find the r.r.e.f.:

$\begin{bmatrix}1&1&1 \\ 1&1&0 \\ 1&0&1\end{bmatrix}$

r.r.e.f.:

$\begin{bmatrix}1&0&0 \\ 0&1&0 \\ 0&0&1\end{bmatrix}$

Thus, $c_{1}=c_{2}=c_{3}=0$

To check if $\text{dim}S=\text{dim}R^3$, count the # of L.I. vectors:

$\text{dim}S=3=\text{dim}R^3$

Therefore, $S$ _is_ a basis for $R^3$

**(b)** To find $\begin{bmatrix}0 \\ 1 \\ -1\end{bmatrix}_{S}$, form the augmented matrix, then find the r.r.e.f.:

$\begin{bmatrix}1&1&1&|&0 \\ 1&1&0&|&1 \\ 1&0&1&|&-1\end{bmatrix}$

r.r.e.f.:

$\begin{bmatrix}1&0&0&|&1 \\ 0&1&0&|&0 \\ 0&0&1&|&-1\end{bmatrix}$

Therefore, $\begin{bmatrix}0 \\ 1 \\ -1\end{bmatrix}_{S}=\begin{bmatrix}1\\0\\-1\end{bmatrix}$

### Problem 2

Let $\vec{u}$, ...

Find the dimension of 
(a) $\text{span}\{\vec{u},\vec{v}\}$
(b) $\text{span}\{\vec{u},\vec{v},\vec{w}\}$
(c) $\text{span}\{\vec{u},\vec{v},\vec{w},\vec{z}\}$

#### Solution

**(a)** $\text{span}\{\vec{u},\vec{v}\}$

$\begin{bmatrix}\boxed{1}&? \\ 0&\boxed{1} \\ 0&0\end{bmatrix}$

$\text{dim}=$ # of L.I. vectors $=$ _2_

Repeat for the rest, easy stuff.

### Problem 3

_Find a basis_ for $R^3$ the includes the vectors $\begin{bmatrix}1\\0\\-1\end{bmatrix}$ and $\begin{bmatrix}-2\\0\\3\end{bmatrix}$

#### Solution

Remember for a basis, the set must satisfy
1. L.I.
2. $\text{dim}S=\text{dim}R^3=3$

$\vec{v_{1}}=\begin{bmatrix}1\\0\\-1\end{bmatrix}$ and $\vec{v_{2}}=\begin{bmatrix}-2 \\ 0 \\ 3\end{bmatrix}$

Usual $R^3$ basis: $\begin{bmatrix}1\\0\\0\end{bmatrix}, \begin{bmatrix}0\\1\\0\end{bmatrix},\begin{bmatrix}0\\0\\1\end{bmatrix}$, where these are $\vec{v_{3}},\vec{v_{4}},\vec{v_{5}},$ respectively

$c_{1} \vec{v_{1}}+c_{2}\vec{v_{2}}+c_{3}\vec{v_{3}}+c_{4}\vec{v_{4}}+c_{5}\vec{v_{5}}=0$

$c_{1} \begin{bmatrix}1 \\ 0 \\ -1\end{bmatrix}+c_{2} \begin{bmatrix}-2\\0\\3\end{bmatrix}+c_{3} \begin{bmatrix}1\\0\\0\end{bmatrix}+c_{4}\begin{bmatrix}0\\1\\0\end{bmatrix}+c_{5}\begin{bmatrix}0\\0\\1\end{bmatrix}=\begin{bmatrix}0\\0\\0\end{bmatrix}$

We need to r.r.e.f. the augmented matrix:

$\begin{bmatrix}1&-2&1&0&0&|&0 \\ 0&0&0&1&0&|&0 \\ -1&3&0&0&1&|&0\end{bmatrix}$

Which eventually leads us to $\begin{bmatrix}\boxed{1}&0&3&0&2&|&0 \\ 0&\boxed{1}&1&0&1&|&0 \\ 0&0&0&\boxed{1}&0&|&0 \end{bmatrix}$

This means our basis should include L.I. vectors $\vec{v_{1}},\vec{v_{2}},$ and $\vec{v_{4}}$. Also, there are 3 L.I. vectors, so $\text{dim}S=3=\text{dim}R^3$.

Thus, the basis is $\vec{v_{1}}=\begin{bmatrix}1\\0\\1\end{bmatrix},\vec{v_{2}}=\begin{bmatrix}-2 \\ 0 \\ 3\end{bmatrix},\vec{v_{4}}=\begin{bmatrix}0\\1\\0\end{bmatrix}$

### Problem 4

Consider the set $S=\{t^2-t, t^2-1, t+2\}$ of vectors in $P_{2}$.

**(a)** Show $S$ forms a basis in $P_2$
**(b)** Find the vector $\vec{v}$ such that $[\vec{v}]_{S}=\begin{bmatrix}1 \\ 2 \\ -3\end{bmatrix}$
**(c)** Given $\vec{w}=t^2+8$, find $[\vec{w}]_{S}$

#### Solution

**(a)**

Remember for basis, the set must satisfy
1. L.I.
2. $\text{dim}S=\text{dim}P_{2}=3$
	- $P_{2}=$ space of all 2nd degree polynomials, e.g., $at^2+bt+c$
	- $\text{dim}S=\text{dim}P_{2}=3$ (there are 3 unique terms... $\text{dim}P_{k}=k+1$)

$\vec{v_{1}}=t^2-t$
$\vec{v_{2}}=t^2-1$
$\vec{v_{3}}=t+2$

Think $\begin{bmatrix}t^2 \\ t \\ \text{const}\end{bmatrix}$ for $\vec{v_{1}},\vec{v_{2}},$ and $\vec{v_{3}}$

$\begin{bmatrix}1&1&0&|&0 \\ -1&0&1&|&0 \\ 0&-1&2&|&0\end{bmatrix}$

r.r.e.f.:

$\begin{bmatrix}1&0&0&|&0 \\ 0&1&0&|&0 \\ 0&0&1&|&0\end{bmatrix}$

Thus, $S$ is L.I. since $\text{dim}S=3=\text{dim}P_{2}$

**(b)**

$[\vec{v}]_{S}=\begin{bmatrix}1\\2\\-3\end{bmatrix}$

$\vec{v_{1}}=t^2-t$
$\vec{v_{2}}=t^2-1$
$\vec{v_{3}}=t+2$

$[\vec{v}]_{S}=1\vec{v_{1}}+2\vec{v_{2}}-3\vec{v_{3}}$

$1(t^2-t)+2(t^2-1)-3(t+2)$
$t^2-t+2t^2-2-3t-6$
$3t^2-4t-8=[\vec{v}]_{S}$

**(c)**

$\vec{w}=t^2+8$, what is $[\vec{w}]_{S}$?

$c_{1}\vec{v_{1}}+c_{2}\vec{v_{2}}+c_{3}\vec{v_{3}}=\vec{w}=t^2+8$

$\begin{bmatrix}1&1&0&|&1 \\ -1&0&1&|&0 \\ 0&-1&2&|&8\end{bmatrix}$

r.r.e.f.:

$\begin{bmatrix}1&0&0&|&3 \\ 0&1&0&|&-2 \\ 0&0&1&|&3\end{bmatrix}$

Thus, $[\vec{w}]_{S}=\begin{bmatrix}3 \\ -2 \\ 3\end{bmatrix}$

### Problem 7

Given the linear transformation $G(\begin{bmatrix}a&b \\ c&d\end{bmatrix})=(a+b)t^3+c$

**(a)** Is $\begin{bmatrix}1&-1 \\ 0&1\end{bmatrix}$ in $\text{ker}G$?

**(b)** Is $\begin{bmatrix}0&0 \\ 1&-1\end{bmatrix}$ in $\text{ker}G$?

**(c)** Is $t+1$ in $\text{range}G$?

**(d)** Is $t^3$ in $\text{range}G$

**(e)** Find a basis for $\text{ker}G$

**(f)** Is $G$ one-to-one?

#### Solution

**(a)**

$\text{ker}G=\{x|f(x)=0\}$

Given $\begin{bmatrix}1&-1 \\ 0&1\end{bmatrix}:$

$(1-1)t^3+0$
$0t^3+0$
$=0$

Therefore, _yes_, $\begin{bmatrix}1&-1 \\ 0&1\end{bmatrix}$ is in $\text{ker}G$

**(b)**

Given $\begin{bmatrix}0&0\\1&-1\end{bmatrix}:$

$(0+0)t^3+1$
$0t^3+1$
$=1\neq 0$

Therefore, _no_, $\begin{bmatrix}1&-1 \\ 0&1\end{bmatrix}$ is _not_ in $\text{ker}G$

**(c)**

Since there is no value of $a,b,c,d$ that yields simply $t$, then $t+1$ is _not_ in $\text{range}G$

**(d)**

What can we plug into $G(\begin{bmatrix}a&b \\ c&d\end{bmatrix})=(a+b)t^3+c$ to give us $t^3$

$\begin{bmatrix}1&0\\0&0\end{bmatrix}$

$(1+0)t^3+0$
$t^3+0$
$=t^3$

Therefore, _yes_, $t^3$ is in $\text{range}G$

**(e)**

$G(\begin{bmatrix}a&b\\c&d\end{bmatrix})=0$

$(a+b)t^3+c=0$

1. $a+b=0$
2. $c=0$

Thus,

1. $b=-a$
2. $c=0$

$\begin{bmatrix}a&-a \\ 0&d\end{bmatrix}$

$\begin{bmatrix}a&-a \\ 0&d\end{bmatrix}=a \begin{bmatrix}1&-1 \\ 0&0\end{bmatrix}+d \begin{bmatrix}0&0 \\ 0&1\end{bmatrix}$

Therefore, a basis for $\text{ker}G$ is

$\{\begin{bmatrix}1&-1 \\ 0&0\end{bmatrix}, \begin{bmatrix}0&0 \\ 0&1\end{bmatrix}\}$

**(f)**

Does $\text{ker}G={0}$? We just found that $\text{ker}G=\{\begin{bmatrix}1&-1 \\ 0&0\end{bmatrix},\begin{bmatrix}0&0\\0&1\end{bmatrix}\}$, so _no_, $G$ is _not_ one-to-one

### Problem 8

#### Solution

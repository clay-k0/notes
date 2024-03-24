- - -
<h1 align="center">M7 + M8</h1>

## Uniform Distribution

**Formula:** $$f(x)=\frac{1}{n},~x=0,1,2,\dots,n$$
#### Example
When playing the lottery game Cash4Life, you must choose a cash ball number from 1 through 4. 

**a)** What is the probability that the randomly drawn cash ball is **at least 2**?
**b)** What is the **variance** of X?

#### Solutions

**a)** Our upper limit is 4, so $P(X\geq 2)=P(2)+P(3)+P(4)=\frac{1}{4}+\frac{1}{4}+\frac{1}{4}=\frac{3}{4}$ 
**b)** Variance: $n=4$, so $$\sigma^2=\frac{(4-1)(4+1)}{12}=\frac{3\times5}{12}=\frac{15}{12}=1.25$$
- - -

## Binomial Distribution
**Formula:** $${n \choose k} \times (p)^k \times (q)^{n-k}$$
#### Example
In a recent poll of female college students, 70% stated that they plan to graduate with a STEM degree. A math teacher at ODU decides to randomly sample 15 female college students. 

**a)** Find the probability that **exactly 6** out of the 15 plan to graduate with a STEM degree.
**b)** Find the probability that **between 5 and 9 (inclusive)** out of the 15 plan to graduate with a STEM degree. 
**c)** Find the probability that **at least 7** out of the 15 plan to graduate with a STEM degree.
**d)** Find the **expected number** of female college students out of 15 that plan to graduate with a STEM degree.
**e)** Find the **standard deviation** for the number of female college students out of 15 that plan to graduate with a STEM degree.

#### Solutions:
$n=15$
$k=6$
$p=.70$
$q=.30$

**a)** $P(X=6)$
- Plug into binomial formula 
$${15 \choose 6} \times (.7)^6 \times (.3)^{15-6}=0.0116$$
Alternatively, we could've done $P(6)-P(5)$ using Table A.1. Note that this would give us $0.0115$ instead.

**b)**  $P(5\leq X\leq 9)$. Using Table A.1, $P(9)-P(4)=0.2777$

**c)** $P(X\geq 7)$, Using Table A.1, $1-F(7)=1-0.0500 = 0.9500$

**d)**  $\mu=pq=(.7)(15)=10.5$

**e)** $\sigma=\sqrt{ 15\times {0}.7\times {0}.3 } = 1.775$

- - -

## Hypergeometric Distribution
**Formula:** $$f(x)=\frac{{k \choose x}{N-k \choose n-x}}{N \choose n}$$

#### Example
Twelve doctors work in a clinic, of which 3 were trained at Harvard Medical School. Four doctors are randomly selected from the 12 clinic doctors to attend a special conference.

**a)** What is the probability that **exactly two** of the doctors going to the conference are Harvard Medical Graduates? 
**b)** What is the probability that **at least one** of the doctors going to the conference are Harvard Medical Graduates?
**c)** Find the **expected number** of doctors out of the 4 that were trained at Harvard Medical School.
**d)** Find the **standard deviation** for the number of doctors out of the 4 that were trained at Harvard Medical School.

#### Solutions
**a)** 
$N=12,~n=4,~k=3,~x=2$
$P(X=2) =$ $$f(x)=\frac{{3 \choose 2}{12-3 \choose 4-2}}{12 \choose 4}=\frac{{3 \choose 2}{9 \choose 2}}{12 \choose 4}=0.2182$$
**b)** $N=12,~n=4,~k=3,~x=0$
$P(X\geq 1)=$ $$f(x)=1-\frac{{3 \choose 0}{12-3 \choose 4-0}}{12 \choose 4}=0.7455$$
**c)** $n = 4,~p=\frac{3}{12}=0.25$
$E(X)=np=(4)(0.25)=1$

**d)** $N=12,~n=4,~p=0.25,~q=0.75$
$\sigma=\sqrt{ npq \times \frac{N-n}{N-1} } =\sqrt{ (4)(0.25)(1-0.25)\times \frac{12-4}{12-1} }=\sqrt{ (0.75)\times \frac{8}{11} }=0.7385$

- - -

## Poisson Distribution
**Formula:**$$f(x)=\frac{{\mu^xe^{-\mu}}}{x!},~x=0,1,2,\dots$$
#### Example
While driving in the car with this family Jeffery likes to look out the window to find Punch Buggies. On average Jeffery sees 3.85 Punch Buggies per hour. Assume seeing Punch Buggies follows a Poisson process.

**a)** Find the probability Jeffery sees **exactly** **2 Punch Buggies in an hour**.
**b)** Find the probability Jeffery sees **more than** **2 Punch Buggies in an hour**. 
#### Solutions
$\mu=3.85,~x=2$

**a)** $P(X=2)=\frac{3.85^2e^{-3.85}}{2!}=0.1577$

**b)** $P(X>2)=1-P(X\leq 2)=(1-(\frac{3.85^0e^{-3.85}}{0!}+\frac{3.85^1e^{-3.85}}{1!}+\frac{3.85^2e^{-3.85}}{2!}))=.2609$

- - -

## Multinomial Distribution
**Formula:** $$f(x_{1},x_{2},\dots,x_{k})=P(X_{1}=x_{1},X_{2}=x_{2},\dots,X_{k}=x_{k})=\frac{n!}{x_{1}!x_{2}!,\dots x_{k}!}p_{1}^{x_{1}}p_{2}^{x_{2}},\dots,p_{k}^{x_{k}}$$
#### Example
25% of American households have only dogs (one or more dogs)
15% of American households have only cats (one or more cats)
10% of American households have dogs and cats (one or more of each)
50% of American households do not have any dogs or cats.

A researcher randomly samples 10 American households. Find the probability that exactly 3 have only dogs, 2 has only cats, 1 has cats and dogs, and 4 has neither cats or dogs.

#### Solutions
$n=10$
$x_{1}=3,x_{2}=2,x_{3}=1,x_{4}=4$
$p_{1}=.25,p_{2}=.15,p_{3}=.10,p_{4}=.50$

$P(X_{1}=3,X_{2}=2,X_{3}=1,X_{4}=4) = f(4,3,2,1)=$
$$\frac{10!}{4!3!2!1!}\times(0.25)^3(0.15)^2(0.10)^1(0.50)^4=.0277$$
> [!warning]
> Be careful how you put this in the calculator. It may be better to do it bit by bit (i.e., $\frac{10!}{(4!3!2!1!)}$ first, then each of the rest).

- - -

## Negative Binomial Distribution
**Formula:** $$f(x)={x-1 \choose k-1}p^kq^{x-k}$$
#### Example
Suppose 1 in every 5 boxes of cereal contain a ticket to the amusement park. You need 3 tickets so you can take your friends to the amusement park. 

**a)** What is the probability that you will get the **third ticket** in your **sixth box** of cereal?
**b)** What is the probability that you get your **first ticket** in your **third box** of cereal?

#### Solutions

**a)** Where $x=6,~k=3,~p=\frac{1}{5}=0.20,~q=0.80$, $$f(x)={6-1 \choose 3-1}(0.20)^3 (0.80)^{6-3}={5 \choose 2}(0.20)^3 (0.80)^{3}=0.04096$$
**b)** Where $x=3,~k=1,~p=\frac{1}{5}=0.20,~q=0.80$, $$f(x)={3-1 \choose 1-1}(0.20)^1 (0.80)^{3-1}={2 \choose 0}(0.20)^1 (0.80)^{2}=0.1280$$
- - -

I have problems from M9 + M10 written down, might add them here.


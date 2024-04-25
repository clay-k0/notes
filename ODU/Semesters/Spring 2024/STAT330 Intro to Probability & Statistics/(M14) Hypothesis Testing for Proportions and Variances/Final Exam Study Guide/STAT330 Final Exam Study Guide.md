## STAT330 Final Exam Study Guide

The final exam consists of modules 11-14, which are covered in Quiz 5 and Quiz 6.

## Quiz 5 (M11 + M12)

#### Question 1

**Problem:** Find the point estimate of the proportion of people who wear hearing aids if, in a random sample of 493 people, 40 people had hearing aids.

**Solution:**

- People w/ hearing aids: 40
- Sample: 493

$$\frac{40}{493}=0.081$$

#### Question 2

**Problem:** Use the given degree of confidence and sample data to construct a confidence interval for the population proportion. 

$n = 51,~x = 23,~95\%\mathrm{~Confidence}$

**Solution:**

We are given:
- $n=51$
- $x=23$
- $95\%\mathrm{~Confidence}$

TI84 Plus CE: `stat` > `TESTS` > `1PropZInt` gives

$$0.314<p<0.588$$

#### Question 3

**Problem:** A survey of 865 voters in one state reveals that 408 favor approval of an issue before legislature. Construct the 95% confidence interval for the true proportion of all voters in the state who favor approval.

**Solution:**

Here,
- $n=865$
- $x=408$
- $95\%~\mathrm{Confidence}$

TI84 Plus CE `stat` > `TESTS` > `1PropZInt` gives

$$0.438<p<0.505$$

#### Question 4

**Problem:** Use the given data to find the minimum sample size required to estimate the population proportion:

Margin of error 0.03, confidence level 95%, and from a prior study an estimate of the population proportion is 0.66.

**Solution:**

- $\hat{p}=0.66$
- $\hat{q}=1-0.66=0.34$
- 95% Confidence $\to 1.96$
- $E=0.03$

Because $\hat{p}$ and $\hat{q}$ are _known_, we need to use

$$m=\left( Z_{\frac{\alpha}{2}} \right)^2\frac{\hat{p}\hat{q}}{E^2}$$
$$=(1.96)^2\frac{(0.66)(0.34)}{0.03^2}=957.8=958$$


#### Question 5

**Problem:** Use the given data to find the minimum sample size required to estimate the population proportion

Margin of error 0.044, confidence level 95%, and an estimate of the population proportion is unknown

**Solution:** 

- 95% Confidence $\to 1.96$
- $E=0.044$

Here, $\hat{p}$ and $\hat{q}$ are _unknown_, so we must use

$$m=\left( Z_{\frac{\alpha}{2}} \right)^2\frac{0.25}{E^2}$$
$$=(1.96)^2\frac{0.25}{0.044^2}=496.1=497$$

#### Question 6

**Problem:** Find $Z_{\frac{\alpha}{2}}$ for a 93% confidence interval.

**Solution:**

TI84 Plus CE `2nd` > `vars` > `invNorm`, then input

$$invNorm\left( \frac{1-0.93}{2} \right)=-1.81$$

Therefore, by symmetry $Z_{\frac{\alpha}{2}}=1.81$

#### Question 7

**Problem:** A 95% confidence interval for a population proportion, $p$, is $0.23<p<0.27$. What was the margin of error, $E$?

**Solution:**

- Lower Limit: 0.23
- Upper Limit: 0.27

$$\frac{0.27-0.23}{2}=0.02$$

#### Question 8

**Problem:** A sample of 40 gym members have a mean age of $\overline x=44$ years.  Assume the population standard deviation is known to be $\sigma=10$ years.  Give a 99% confidence interval for the population mean age, $\mu$.

**Solution:**

- $n=40$
- $\overline x=44$
- $\sigma=10$
- $99\%~\mathrm{Confidence}(0.99)$

TI84 Plus CE: `stat` > `TESTS` > `ZInterval` gives

$$39.9<\mu<48.1$$

#### Question 9

**Problem:** A college would like to estimate the average monthly income of its students. How many students must be sampled in order to estimate $\mu$ with 90% confidence and a margin of error of $E$ = \$4? Suppose the population standard deviation is known to be \$70.

**Solution:**

$90\%~\mathrm{Confidence}\to 1.645$

$$n=\left[\frac{1.645(70)}{4} \right]^2=828.7=829$$

#### Question 10

**Problem:** Find $t_{\frac{\alpha}{2}}$for a 90% confidence interval for a population mean and a sample size of 30.

**Solution:**

- $\nu=30-1=29$
- $1-0.90=0.10$ and $\frac{0.10}{2}=0.05$

At $\alpha=0.05$ and $\nu=29$ on [Table A.4](./Resources/Table_A4.pdf), we find $t_{\frac{\alpha}{2}}=1.699$

#### Question 11

**Problem:** A researcher is interested in knowing the number of pounds a woman can lift over her head. A random sample of 16 women finds that on average they can lift 48 pounds over their head. The sample standard deviation is 10 pounds. Construct a 95% confidence interval for the average number of pounds a woman can life over her head.  Assume the number of pounds a woman can lift is normally distributed.

**Solution:**

- $n=16$ (Sample Size)
- $\overline x=48$ (Sample Mean)
- $Sx=10$ (Sample Standard Deviation)

TI84 Plus CE: `stat` > `TESTS` > `TInterval` gives

$$42.67<\mu<53.33$$

#### Question 12

**Problem:** A 95% confidence interval for a population proportion, $p$, is $0.23<p<0.27$. What was the sample proportion, $\hat{p}$?

**Solution:**

$$\hat{p}=\frac{\mathrm{Lower~Limit~+~Upper~Limit}}{2}=\frac{0.23+0.27}{2}=0.25$$

#### Question 13

**Problem:**

**Solution:**

#### Question 14

**Problem:** The blood volumes in milliliters is collected for two samples of males, one from males who are paraplegic and participate in vigorous physical activities and another from males who are able-bodied and participate in normal activities. Assume the variances blood volume measurements have normal distributions for both populations of males with a common variance. The sample of 7 males who are paraplegic and participate in vigorous physical activities had a mean blood volume of 1511.7 with a variance of 49669.9. The sample of 10 males who are able-bodied and participate in normal activities had a mean blood volume of 1118.40 with a variance of 15297.6. Find a 99% confidence interval for the difference in mean blood volume, $\mu_{\mathrm{paraplegic}}−\mu_{\mathrm{able~bodied}}$.

**Solution:**

$\mu_{\mathrm{paraplegic}}$:
- $\overline x_{1}=1511.7$
- $s_{1}^2=49669.9$
- $n_{1}=7$

$\mu_{\mathrm{able~bodied}}$:
- $\overline x_{2}=1118.40$
- $s_{2}^2=15297.6$
- $n_{2}=7$

$\nu=(n_{1}+n_{2})-2=(7+10)-2=15$

$\alpha=1-0.99=0.01$

$\frac{\alpha}{2}=\frac{0.01}{2}=0.005$

$t$ value on TI 84 Plus CE using $\alpha=1-0.99=0.01$ and $\nu=15$:

`2nd` > `vars` > `invT(`, then input

$$invT(0.005,15)$$

to get $-2.95$, and by symmetry $2.95$

$$(\overline x_{1}-\overline x_{2})+t\times \sqrt{ \frac{(n_{1}-1)s_{1}^2(n_{2}-1)s_{2}^2}{(n_{1}+n_{2})-2} \times \left( \frac{1}{n_{1}}+\frac{1}{n_{2}} \right)}$$

$$=(1511.7-118.40) \pm 2.947 \times \sqrt{ \frac{6\times 49669.9+9 \times 15297.6}{7+10-2} \times \left( \frac{1}{7}+\frac{1}{10} \right)}$$


#### Question 15

**Problem:** A random sample (sample 1) of 20 is taken from a normal population with a population standard deviation of 4. Sample 1 has a sample mean of 105. Another random sample (sample 2) of 15 is taken from a different normal population with a population standard deviation of 6. Sample 2 has a sample mean of 92. Find a 90% confidence interval for $\mu_{1}-\mu_{2}$.

**Solution:**

Sample 1:
- $n=20$
- $\overline x_{1}=105$

Sample 2:
- $n=15$
- $\overline x_{2}=92$

- $90\%~\mathrm{Confidence} = 0.90$

TI84 Plus CE: `stat` > `TESTS` > `2-SampZInt` gives

$$10.058<\mu_{1}-\mu_{2}<15.942$$

#### Question 16

**Problem:** Time, March 29, 1993, reported the proportions of adult Americans who favor "stricter gun-control laws." A telephone poll of 800 adult Americans, of who 374 were gun owners and 426 did not own guns, showed that 206 gun owners and 338 non-gun owners favor stricter gun-control laws. Let $p_{1}$ and $p_{2}$ be the respective proportions of gun owners and non-gun owners who favor stricter gun-control laws. Find a 95% confidence interval for $p_{1}-p_{2}$.

**Solution:**

Sample 1:
- $n_{1}=374$
- $\overline x_{1} = 206$

Sample 2:
- $n_{2}=426$
- $\overline x_{2}=338$

- $95\%~\mathrm{Confidence}=0.95$

Using TI84 Plus CE: `stat` > `TESTS` > `2-PropZInt` gives

$$-0.306<p_{1}-p_{2}<0.179$$

#### Question 17

**Problem:** A random sample of 9 wheels of cheese yielded the following weights in pounds has a sample mean of 20.90 and a sample variance of 3.45. Assume the weights of wheels of cheese have a normal distribution. Find a 90% confidence interval for the population variance.

**Solution:**

- $n=9$
- $\overline x = 20.90$
- $s^2=3.45$
- $\nu=9-1=8$
- $90\%~\mathrm{Confidence}=0.90$

$1-0.90=0.10$

At $\frac{\alpha}{2}=\frac{0.10}{2}=0.05$ and $\nu=8$, [Table A.4]

#### Question 18

**Problem:** A random sample of 9 wheels of cheese yielded the following weights in pounds has a sample mean of 20.90 and a sample variance of 3.45. Assume the weights of wheels of cheese have a normal distribution. Find a 90% confidence interval for the population standard deviation.

**Solution:**

#### Question 19

**Problem:** Let X and Y equal the concentration in parts per billion of chromium in the blood for healthy persons and for persons with a suspected disease, respectively. Assume that the distributions of X and Y are normal. A sample of 8 observations for X have a sample mean of 15.75 and a sample variance of 46.21. A sample of 10 observations of Y have a sample mean of 23.3 and a sample variance of 92.68. Find a 90% confidence interval for the ratio of variances, $\frac{\sigma^2x}{\sigma^2y}$.

**Solution:** 

Sample X:
- ${n_x = 8}$ (sample size)
- ${\bar{x} = 15.75}$ (sample mean)
- ${s_x^2 = 46.21}$ (sample variance)
- $\nu_{1}=n_{x}-1=8-1=7$

Sample Y:
- ${n_y = 10}$ (sample size)
- ${\bar{y} = 23.3}$ (sample mean)
- ${s_y^2 = 92.68}$ (sample variance)
- $\nu_{1}=n_{y}-1=10-1=9$


$$F=\frac{s_{x}^2}{s_{y}^2}=\frac{46.21}{92.68}=0.499$$

- Calculated F-statistic: 46.2192.68≈0.49992.6846.21​≈0.499
- Critical values for a 90% confidence interval from the F-distribution:
    - Lower: 0.272
    - Upper: 3.293

$90\%~\mathrm{Confidence~Interval}$

- Lower bound: $\frac{0.499}{3.293}=0.151$
- Upper bound: $\frac{0.499}{0.272}=1.833$

#### Question 20

**Problem:** A biologist who studies spiders was interested in comparing the lengths of female and male green lynx spiders. She collects two samples and calculates the confidence interval for the difference in mean length to be $−3.21<\mu_{\mathrm{female}}−\mu_{\mathrm{male}}<−1.83$.

Based on this confidence interval, which statement is true?

**Solution:**

Here's a trick for questions asking what can be concluded from 2 given samples:

| Interval Result            | Conclusion      |
| -------------------------- | --------------- |
| Both Positive Values       | $p_{1}>p_{2}$   |
| Both Values Negative       | $p_{1}<p_{2}$   |
| One Positive, One Negative | Cannot conclude |

Observing $p_{1}=3.21$ and $p_{2}=-1.83$, we notice that one value is positive, while the other is negative.

Therefore, we suspect the average length of _male_ green lynx spiders to be _longer_ than the average length of _female_ green lynx.

## Quiz 6 (M13 + M14) 

#### Question 1

**Problem:** A brewery distributes beer cans in labeled 12 oz. The Bureau of Weights and Measures randomly selects 36 cans, measures their contents, and obtains a sample mean of 11.82 oz. Assuming that the population standard deviation is known to be 0.38 oz, is it valid at a 0.01 significance level to conclude that the brewery is cheating consumers? In other words, test the claim that the true mean amount of beer in the cans is less than 12 oz.

Select the correct null and alternative hypothesis.

**Solution:** 

$$H_{0}:\mu=12$$
$$H_{1}:\mu<12$$

#### Question 2

**Problem:** For a significance level of 4% and the alternative hypothesis of $H_{1}:\mu\neq 100$, the $Z$ critical values is/are:

**Solution:**

$\neq$ denotes a two-tailed test

$\alpha=0.04$

$\frac{\alpha}{2}=\frac{0.04}{2}=0.02$

Closest Table A.3 value to $0.0200$ leads us to

$$-2.05$$

and by symmetry,

$$+2.05$$

#### Question 3

**Problem:** For a significance level of 3% and the alternative hypothesis of $H_{1}:\mu> 100$, the $Z$ critical values is/are:

**Solution:**

$>$ denotes a right-tailed test

$\alpha=0.03$

$1-\alpha=1-0.03=0.9700$

Closest Table A.3 value to $0.9700$ leads us to $1.88$

#### Question 4

**Problem:** It was claimed that many commercially manufactured dice are not fair because the "spots" are really indentations so that, for example, the 6-side is lighter than the 1-side. Let p equal the probability of rolling a 6 with one of these dice. A researcher wanted to test the claim that p is really greater than $\frac{1}{6}$ . He uses several of these dice to collect B000 observations and calculates the test statistic to be 1.67, Using a 0.05 level of significance, the critical region is $Z> 1.645$. What decision did the researcher make? 

**Solution:**

Because the test statistic, $1.67$, is greater than the critical value, $1.645$, falling in the region, we _reject_ $H_{0}$.

#### Question 5

**Problem:** In a study of distances traveled by buses before the first major engine failure, a researcher claims that the mean distance traveled before the first major engine failure is less than 90,000 miles. The test statistic is $Z=-0.57$. Find the $p$-value for testing the researcher's claim.

**Solution:**

less than, $<$, indicates a left-tailed test

$Z$ is given as $-0.57$

The area to the left of  $-0.57$ in Table A.3 is $p=0.2843$

#### Question 6

**Problem:** A certain nighttime cold medicine bears a label indicating the presence of 600 mg of acetaminophen in each fluid ounce of the drug. Determine the $p$-value for testing $H_{0}:\mu=600$ versus the two-sided alternative $H_{1}:\mu\neq 600$. Suppose the observed value of the test statistic is $Z=-1.12$.

**Solution:**

$\neq$ indicates a two-tailed test

$Z$ is given as $-1.12$

The area to the left of $|-1.12|=1.12$ in Table A.3 is $0.8686$, meaning the area to the right is $1-0.8686=0.1314$.

Therefore, our $p$-value is $2 \times 0.1314=0.2628$

> [!Note]
> 
> Remember, we only multiply the $p$-value by 2 when we are performing a two-tailed test.

#### Question 7

**Problem:** A researcher is interested in species diversity of two different wetland areas. She claims that wetland has higher species diversity than wetland 2. Assume the population standard deviations are known and the test statistic is calculated to be $Z=2.98$. Find the $p$-value for testing their claim.

**Solution:**

"higher", $>$, indicates a right-tailed test

$Z$ is given as $2.98$

The area to the right of $2.98$ in Table A.3 is $1-0.9986=0.0014$.

Therefore, our $p$-value is $0.0014$

#### Question 8

**Problem:** A researcher claims that more than 25% of Americans support a new bill in congress. The hypothesis test results in a $p$-value of 0.0311. State the conclusion based on a significance level, $\alpha=0.05$.

**Solution:**

Since the $p$ value $0.0311$ is less than our significance level of $\alpha=0.05$, we reject $H_{0}$.

#### Question 9

**Problem:** Let X (in millimeters) equal the growth in 15 days of a tumor induced in a mouse. Assume X is normally distributed. A random sample of 9 tumors induced in mice is observed with a mean growth of 4.3 millimeters and a standard deviation of 1.2 millimeters. Calculate the test statistic to be used to calculated the claim that mean growth is not equal to 4.0 millimeters.

**Solution:**

$$H_{0}:\mu=4.0$$
$$H_{1}:\mu \neq 4.0$$

$n=9,~\overline x=4.3,~\mu_{0}=4.0,$ and $s=1.2$

Therefore,


$$t=\frac{\overline x-\mu_{0}}{\frac{s}{\sqrt{ n }}}=\frac{4.3-4.0}{\frac{1.2}{\sqrt{ 9 }}}=0.75$$

#### Question 10

**Problem:** For a significance level of 2%, where $\nu=12$, and the alternative hypothesis is $H_{1}:\mu<25$, the $t$ critical value(s) is/are:

**Solution:**

$<$ indicates a left-tailed test

$\nu=12,~\alpha=0.02$ are given

In Table A.4,

1. Use the _row_ corresponding to degrees of freedom, $\nu=12$
2. Use the _column_ corresponding to $\alpha=.02$
3. A left-tailed test has one negative critical value, therefore the critical $t$ value $-2.303$

#### Question 11

**Problem:** A sample of the thickness (in hundredths of an inch) of 15 pieces of Fruit Flavored Bubble Gum yielded a sample mean of 6.841 and a standard deviation of 0.155. A second independent sample of the thickness of 10 pieces of Fruit Flavored Gum yielded a sample mean of 6.701 and a standard deviation of 0.108. A researcher claims that Fruit Flavored Bubble Gum should be thicker on average than Fruit Flavored Gum because bubble gum has more elasticity than regular gum. Assume both distributions are normally distributed. Which test statistic is appropriate for testing the researcher's claim?

**Solution:**

Since the population standard deviations, $\sigma_{1}$ and $\sigma_{2}$, are _unknown and unequal_, the test statistic is calculated as:

$$t'=\frac{(\overline x_{1}-\overline x_{2})-d_{0}}{\sqrt{\frac{s_{1}^2}{n_{1}}+\frac{s_{2}^2}{n_{2}}}}$$

#### Question 12

**Problem:** Suppose that we wish to test the hypotheses

$$H_{0}:\mu=88$$
$$H_{1}:\mu>88$$

for scores on a test using an $\alpha=0.05$ level of significance, when it is known that $\sigma=7$. Find the sample size required if the power of our test is to be 0.85 when the true mean is 92.

**Solution:**

- $\alpha=.05$ area to the left is $1-.05=.9500$. 
- The closest values to $.9500$ on [Table A.3](./Resources/Table_A3.pdf) are $.9495$ and $.9505$, which are at $1.64$ and $1.65$, respectively, therefore $Z_{\alpha}=\frac{1.64+1.65}{2}=1.645$
- Power $=1-\beta$ where $\beta=1-\mathrm{Power}=1-.85=.15$. 
	- Closest Table A.3 value is to $0.8500$ is $0.8508$, so $Z_{\beta}=1.04$
- $\sigma^2=7^2=49$
- $\delta=92-88=4$ (This is the difference between $\mu_{0}=88$ and the fixed alternative of 92 in the problem statement)

$$n=\frac{(Z_{\alpha}+Z_{\beta})\sigma^2}{\delta^2}=\frac{(1.645+1.04)^2(49)}{4^2}=22.1=23$$

#### Question 13

**Problem:** Suppose that we wish to test the hypotheses

$$H_{0}:\mu=75$$
$$H_{1}:\mu>75$$

for scores on a test using an $\alpha=0.01$ level of significance, when it is known that $\sigma=5$. Find the sample size required if the power of our test is to be 0.90 when the true mean is 69.

**Solution:**

- $\frac{\alpha}{2}=\frac{.01}{2}=.005$ area to the left is $1-.005=.995$ in [Table A.3](./Resources/Table_A3.pdf) leads us to $\frac{2.57+2.58}{2}=2.575$
- Power = $1-\beta\to \beta=1-\mathrm{Power}=1-.90=.10$, looking for the area to the left, $1-.10=.9000$, which leads us to $1.28$
- $\sigma^2=5^2=25$
- $\delta=75-69=6$

$$n=\frac{\left( Z_{\frac{\alpha}{2}}+Z_{\beta} \right)\sigma^2}{\delta^2}=\frac{(2.575+1.28)^2(25)}{6^2}=10.3=11$$

#### Question 14

**Problem:** A researcher wants to test the claim that the average amount of money spent weekly on groceries for a family of 4 in Hampton Roads is $200. How large a sample is needed to test the researcher's claim if the power of the test is to be 0.9 when the true mean amount of money spend is within $0.4\sigma$ of the hypothesized value? Use $\alpha=0.05$.

**Solution:**

#TODO Come back to this... (chose 68)

#### Question 15

**Problem:** A poll of 500 likely voters found that 275 are planning to vote for the Democratic Presidential Candidate. At the 0.05 level of significance, test the claim that more than half (50%) of likely voters are planning to vote for the Democratic Presidential Candidate.

**Solution:**

$$H_{0}:p=0.50$$
$$H_{1}:p>0.50$$

$\hat{p}=\frac{275}{500}=0.55$

$$z=\frac{\hat{p}-p_{0}}{\sqrt{ \frac{p_{0} \times (1-p_{0})}{n} }}=\frac{0.55-0.50}{\sqrt{ \frac{0.50 \times 0.50}{500} }}=2.24$$

#### Question 16

**Problem:** For a significance level of 2%, the alternative hypothesis of a variance less than 0.5, and a sample size of 20, the Chi-Squared critical value(s) is/are:

**Solution:**

$<$ indicates a left-tailed test

$\nu-n-1=20-1=19$

$\alpha=0.02$

In [Table A.5](./Resources/Table_A5.pdf), we look up the critical value using the column $1-\alpha=1-0.02=0.98$ and the row of $\nu=19$.

We find the critical value $\chi^2=8.567$.

#### Question 17

**Problem:** Past data indicates that the amount of money contributed by the working residents of a large city to a volunteer rescue squad is a normal random variable with a standard deviation of \$1.40. It has been suggested that the contributors to the rescue squad from just the employees of the sanitation department are much more variable. If the contributors of a random sample of 12 employees from the sanitation department have a standard deviation of \$1.75, calculate the test statistic to be used to the test the claim that the standard deviation for the contributions of all sanitation workers is greater than than of all workers living in the city.

**Solution:**

greater than, $>$ indicates a right-tailed test

$$H_{0}:\sigma^2=1.40$$
$$H_{1}:\sigma^2>1.40$$

The sample data gives us:

$n=12$

$s=1.75$

$\sigma=1.40$

Therefore,

$$\chi^2=\frac{(n-1)s^2}{\sigma_{0}^2}=\frac{11(1.75^2)}{1.40^2}=17.1875$$

#### Question 18

**Problem:** Past data indicates that the amount of money contributed by the working residents of a large city to a volunteer rescue squad is a normal random variable with a standard deviation of \$1.40. It has been suggested that the contributors to the rescue squad from just the employees of the sanitation department are much more variable. If the contributors of a random sample of 12 employees from the sanitation department have a standard deviation of \$1.75, test the claim that the standard deviation of the contributions of all sanitation workers living in the city using a 0.01 level of significance.

**Solution:**

Recall our test statistic, $\chi^2=17.1875$

greater than, $>$ indicates a right-tailed test

$\nu=n-1=12-1=11$

In Table A.5, at $\nu=11$ and $\alpha=0.01$, we find the critical value $24.725$.

Because our test statistic $17.1875$ does not exceed $24.725$, we fail to reject $H_{0}$.

#### Question 19

**Problem:** Find the critical values for a two-tailed test with a 2% significance level, $n_{1}=25,~n_{2}=10$, and the $F$ distribution as the sampling distribution for the ratio of two sample variances.

**Solution:**

two-tailed test ($\neq$)

$\nu_{1}=n_{1}-1=25-1=24$

$\nu_{2}=n_{2}-1=10-1=9$

- Two-tailed test: $\alpha=\frac{0.02}{2}=0.01$ is the area in each of the tails
- In [Table A.6](./Resources/Table_A6.pdf), we look up the right-hand critical value using $\alpha=0.01,\nu_{1}=24,$ and $\nu_{2}=9$.
	- Here, we find the critical value $f=4.73$
- In [Table A.6](./Resources/Table_A6.pdf), we look up the left-hand critical value using $\alpha=0.01,\nu_{1}=9,$ and $\nu_{2}=24$.
	- Here, we find the critical value $f=\frac{1}{3.26}=0.31$

Therefore, the two critical values are $0.31$ and $4.73$.

#### Question 20

**Problem:** A study is conducted to compare final exam scores for students who take a class in a Fall semester vs. a Spring semester. Let sample 1 be a random sample of final exam scores for the Fall semester with a mean of 78 and a standard deviation of 4.2. Let sample 2 be a random sample of final exam scores for the Spring semester with a mean of 82 and a standard deviation of 3.8. Calculate the test statistic to be used for testing the claim that the variances are equal.

**Solution:**

Test for equivalence, ($\neq$), two-tailed test

$$H_{0}:\sigma_{1}^2=\sigma_{2}^2$$
$$H_{1}:\sigma_{1}^2\neq\sigma_{2}^2$$

$$s_{1}^2=4.2^2=17.64$$
$$s_{2}^2=3.8^2=14.44$$

Therefore,

$$f=\frac{s_{1}^2}{s_{2}^2}=\frac{17.64}{14.44}=1.22$$







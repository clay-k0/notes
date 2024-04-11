## STAT330 Quiz 5 #19

Given:
- ${n_x = 8}$ (sample size for X)
- ${\bar{x} = 15.75}$ (sample mean for X)
- ${s_x^2 = 46.21}$ (sample variance for X)
- ${n_y = 10}$ (sample size for Y)
- ${\bar{y} = 23.3}$ (sample mean for Y)
- ${s_y^2 = 92.68}$ (sample variance for Y)

The degrees of freedom for X and Y are ${n_x - 1}$ and ${n_y - 1}$ respectively. Thus:
- ${df_x = 7}$
- ${df_y = 9}$

The test statistic for the ratio of variances is:
$$ F = \frac{s_x^2 / \sigma_x^2}{s_y^2 / \sigma_y^2} = \frac{s_x^2}{s_y^2} $$

Substituting the sample variances:
$$ F = \frac{46.21}{92.68} $$

Now, we need to find the critical values from the F-distribution for a 90% confidence interval. This involves finding ${F_{0.05, 7, 9}}$ and ${F_{0.95, 7, 9}}$, which are the 5th and 95th percentiles of the F-distribution with 7 and 9 degrees of freedom, respectively.

The calculated F-statistic for the ratio of variances is approximately ${0.499}$. The critical values from the F-distribution for a 90% confidence interval are approximately ${0.272}$ for the 5th percentile and ${3.293}$ for the 95th percentile.

Using these critical values, the 90% confidence interval for the ratio of variances ${\sigma_x^2 / \sigma_y^2}$ is calculated as follows:
- Lower bound: ${\frac{0.499}{3.293} \approx 0.151}$
- Upper bound: ${\frac{0.499}{0.272} \approx 1.833}$

Thus, the 90% confidence interval for the ratio of variances ${\sigma_x^2 / \sigma_y^2}$ is approximately ${[0.151, 1.833]}$. This interval suggests that the variance of X could be between 15.1% and 183.3% of the variance of Y under the normality assumption of the data.

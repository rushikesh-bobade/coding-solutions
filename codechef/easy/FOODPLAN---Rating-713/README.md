# FOODPLAN - Rating 713

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Online or Offline

Chef is confused whether to go out and eat at the restaurant or order food online.

The online order costs $N$ rupees while the cost of eating at the restaurant is $M$ rupees.
However, Chef has a discount coupon with which he can avail flat $10\%$ off on his online order.

Find the cheaper option for Chef to eat, i.e., whether to order food online or eat at the restaurant.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two space-separated integers $N$ and $M$, the cost of ordering online and eating at the restaurant respectively.
### Output Format

For each test case, output on a new line:

- ONLINE, if Chef gets a better deal in online ordering,
- DINING if Chef gets a better deal in eating at the restaurant,
- EITHER if both deals cost the same.

You may print each character in uppercase or lowercase, For example, the strings `Online`, `online`, `ONLINE`, and `onLiNe` are all considered identical.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N, M \leq 1000$
### Sample 1:
Input
Output

```
4
500 500
500 400
25 22
100 90
```

```
ONLINE
DINING
DINING
EITHER
```

### Explanation:

**Test case $1$:** The final price of ordering online would be $500 - (10\%$ of $500) = 450$ which is less than the price of dining. Thus, Chef should order online.

**Test case $2$:** The final price of ordering online would be $500 - (10\%$ of $500) = 450$ which is not less than $400$. Thus, Chef should choose dining option.

**Test case $3$:** Even after the $10\%$ discount, cost of ordering online is higher. Thus, Chef should choose dining option.

**Test case $4$:** After $10\%$ discount, cost of ordering online is $90$. The costs of ordering online and dining at restaurant are same. Thus, Chef can choose any option.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T13:27:50.481Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/FOODPLAN)
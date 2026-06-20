# APPLEORANGE - Rating 1040

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Apples and oranges

Rushitote went to a programming contest to distribute apples and oranges to the contestants.
He has $N$ apples and $M$ oranges, which need to be divided  **equally**  amongst the contestants. Find the maximum possible number of contestants such that:

- Every contestant gets an equal number of apples; and
- Every contestant gets an equal number of oranges.

Note that every fruit with Rushitote  *must*  be distributed, there cannot be any left over.

For example, $2$ apples and $4$ oranges can be distributed equally to two contestants, where each one receives $1$ apple and $2$ oranges.
However, $2$ apples and $5$ oranges can only be distributed equally to one contestant.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- The first and only line of each test case contains two space-separated integers $N$ and $M$ — the number of apples and oranges, respectively.
### Output Format

For each test case, output on a new line the answer: the maximum number of contestants such that everyone receives an equal number of apples and an equal number of oranges.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq N, M \leq 10^9$
### Sample 1:
Input
Output

```
3
1 5
2 4
4 6
```

```
1
2
2
```

### Explanation:

 **Test case $1$:**  There's only one apple, so distributing to more than one person is impossible.

 **Test case $2$:**  As explained in the statement, $2$ people can each receive $1$ apple and $2$ oranges.

 **Test case $3$:**  $2$ people can each receive $2$ apples and $3$ oranges. It's not possible to distribute equally to more than two people.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-20T11:05:07.343Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();
            long M = sc.nextLong();

            System.out.println(gcd(N, M));
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/APPLEORANGE)
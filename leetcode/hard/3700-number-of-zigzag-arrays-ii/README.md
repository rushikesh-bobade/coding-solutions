# Number of ZigZag Arrays II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given three integers `n`, `l`, and `r`.

A  **ZigZag**  array of length `n` is defined as follows:

- Each element lies in the range [l, r].
- No two adjacent elements are equal.
- No three consecutive elements form a strictly increasing or strictly decreasing sequence.

Return the total number of valid  **ZigZag**  arrays.

Since the answer may be large, return it  **modulo**  `109 + 7`.

A  **sequence**  is said to be  **strictly increasing**  if each element is strictly greater than its previous one (if exists).

A  **sequence**  is said to be  **strictly decreasing**  if each element is strictly smaller than its previous one (if exists).

 

 **Example 1:** 

 **Input:**  n = 3, l = 4, r = 5

 **Output:**  2

 **Explanation:** 

There are only 2 valid ZigZag arrays of length `n = 3` using values in the range `[4, 5]`:

- [4, 5, 4]
- [5, 4, 5]

 **Example 2:** 

 **Input:**  n = 3, l = 1, r = 3

 **Output:**  10

 **Explanation:** 

​​​​​​​There are 10 valid ZigZag arrays of length `n = 3` using values in the range `[1, 3]`:

- [1, 2, 1], [1, 3, 1], [1, 3, 2]
- [2, 1, 2], [2, 1, 3], [2, 3, 1], [2, 3, 2]
- [3, 1, 2], [3, 1, 3], [3, 2, 3]

All arrays meet the ZigZag conditions.

 

 **Constraints:** 

- 3 <= n <= 109
- 1 <= l < r <= 75​​​​​​​

## Solution

**Language:** Java  
**Runtime:** 304 ms (beats 58.06%)  
**Memory:** 47.1 MB (beats 29.03%)  
**Submitted:** 2026-06-24T13:19:09.899Z  

```java
class Solution {
    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        if (n == 1) return m;

        int sz = 2 * m;

        long[] state = new long[sz];

        // U2
        for (int i = 0; i < m; i++) {
            state[i] = i;
        }

        // D2
        for (int i = 0; i < m; i++) {
            state[m + i] = m - 1 - i;
        }

        if (n == 2) {
            long ans = 0;
            for (long x : state) ans = (ans + x) % MOD;
            return (int) ans;
        }

        long[][] T = new long[sz][sz];

        // upper-right block = L
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                T[i][m + j] = 1;
            }
        }

        // lower-left block = R
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                T[m + i][j] = 1;
            }
        }

        long[][] P = power(T, n - 2);

        long[] result = multiply(P, state);

        long ans = 0;
        for (long x : result) {
            ans = (ans + x) % MOD;
        }

        return (int) ans;
    }

    private long[] multiply(long[][] A, long[] v) {
        int n = A.length;
        long[] res = new long[n];

        for (int i = 0; i < n; i++) {
            long cur = 0;

            for (int j = 0; j < n; j++) {
                cur = (cur + A[i][j] * v[j]) % MOD;
            }

            res[i] = cur;
        }

        return res;
    }

    private long[][] power(long[][] A, long exp) {
        int n = A.length;

        long[][] res = new long[n][n];

        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = multiply(res, A);
            }

            A = multiply(A, A);
            exp >>= 1;
        }

        return res;
    }

    private long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;

        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {

                if (A[i][k] == 0) continue;

                long aik = A[i][k];

                for (int j = 0; j < n; j++) {

                    if (B[k][j] == 0) continue;

                    C[i][j] =
                        (C[i][j] + aik * B[k][j]) % MOD;
                }
            }
        }

        return C;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-zigzag-arrays-ii/)
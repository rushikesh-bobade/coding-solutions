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
**Runtime:** 0 ms  
**Memory:** 42.2 MB  
**Submitted:** 2026-06-24T13:04:57.057Z  

```java
class Solution {
    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        if (n == 1) return m;

        long[] U2 = new long[m];
        long[] D2 = new long[m];

        for (int i = 0; i < m; i++) {
            U2[i] = i;
            D2[i] = m - 1 - i;
        }

        if (n == 2) {
            long ans = 0;
            for (int i = 0; i < m; i++) {
                ans += U2[i] + D2[i];
            }
            return (int) (ans % MOD);
        }

        long[][] A = new long[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = Math.min(i, j);
            }
        }

        long[] baseU, baseD;
        long exp;

        if ((n & 1) == 0) {
            // even length
            baseU = U2;
            baseD = D2;
            exp = n / 2 - 1;
        } else {
            // length 3 bases
            long[] U3 = new long[m];
            long[] D3 = new long[m];

            for (int i = 0; i < m; i++) {
                long s1 = 0;
                for (int j = 0; j < i; j++) {
                    s1 += D2[j];
                }
                U3[i] = s1 % MOD;

                long s2 = 0;
                for (int j = i + 1; j < m; j++) {
                    s2 += U2[j];
                }
                D3[i] = s2 % MOD;
            }

            baseU = U3;
            baseD = D3;
            exp = (n - 3L) / 2;
        }

        long[][] P = matPow(A, exp);

        long[] finalU = matVec(P, baseU);
        long[] finalD = matVec(P, baseD);

        long ans = 0;
        for (int i = 0; i < m; i++) {
            ans = (ans + finalU[i] + finalD[i]) % MOD;
        }

        return (int) ans;
    }

    private long[] matVec(long[][] M, long[] v) {
        int n = M.length;
        long[] res = new long[n];

        for (int i = 0; i < n; i++) {
            long cur = 0;
            for (int j = 0; j < n; j++) {
                cur = (cur + M[i][j] * v[j]) % MOD;
            }
            res[i] = cur;
        }
        return res;
    }

    private long[][] matPow(long[][] A, long e) {
        int n = A.length;

        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) res[i][i] = 1;

        long[][] cur = A;

        while (e > 0) {
            if ((e & 1) == 1) {
                res = multiply(res, cur);
            }
            cur = multiply(cur, cur);
            e >>= 1;
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

                    C[i][j] = (C[i][j] + aik * B[k][j]) % MOD;
                }
            }
        }

        return C;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-zigzag-arrays-ii/)
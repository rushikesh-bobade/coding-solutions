# Number of ZigZag Arrays I

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
- [5, 4, 5]​​​​​​​

 **Example 2:** 

 **Input:**  n = 3, l = 1, r = 3

 **Output:**  10

 **Explanation:** 

There are 10 valid ZigZag arrays of length `n = 3` using values in the range `[1, 3]`:

- [1, 2, 1], [1, 3, 1], [1, 3, 2]
- [2, 1, 2], [2, 1, 3], [2, 3, 1], [2, 3, 2]
- [3, 1, 2], [3, 1, 3], [3, 2, 3]

All arrays meet the ZigZag conditions.

 

 **Constraints:** 

- 3 <= n <= 2000
- 1 <= l < r <= 2000

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 41.8 MB  
**Submitted:** 2026-06-23T16:18:33.191Z  

```java
class Solution {
    static final long MOD = 1_000_000_007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        long[] up = new long[m];
        long[] down = new long[m];

        // length = 2
        for (int a = 0; a < m; a++) {
            for (int b = 0; b < m; b++) {
                if (a < b) {
                    up[b]++;
                } else if (a > b) {
                    down[b]++;
                }
            }
        }

        // build lengths 3..n
        for (int len = 3; len <= n; len++) {

            long[] newUp = new long[m];
            long[] newDown = new long[m];

            long[] prefDown = new long[m];
            prefDown[0] = down[0];

            for (int i = 1; i < m; i++) {
                prefDown[i] = (prefDown[i - 1] + down[i]) % MOD;
            }

            long[] suffUp = new long[m];
            suffUp[m - 1] = up[m - 1];

            for (int i = m - 2; i >= 0; i--) {
                suffUp[i] = (suffUp[i + 1] + up[i]) % MOD;
            }

            for (int v = 0; v < m; v++) {

                // previous value smaller
                if (v > 0) {
                    newUp[v] = prefDown[v - 1];
                }

                // previous value larger
                if (v + 1 < m) {
                    newDown[v] = suffUp[v + 1];
                }
            }

            up = newUp;
            down = newDown;
        }

        long ans = 0;

        if (n == 2) {
            for (int i = 0; i < m; i++) {
                ans = (ans + up[i] + down[i]) % MOD;
            }
            return (int) ans;
        }

        for (int i = 0; i < m; i++) {
            ans = (ans + up[i] + down[i]) % MOD;
        }

        return (int) ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-zigzag-arrays-i/)
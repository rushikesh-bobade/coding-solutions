# Count Submatrices With Equal Frequency of X and Y

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a 2D character matrix `grid`, where `grid[i][j]` is either `'X'`, `'Y'`, or `'.'`, return the number of submatrices that contain:

- grid[0][0]
- an equal frequency of 'X' and 'Y'.
- at least one 'X'.

 

 **Example 1:** 

 **Input:**  grid = [["X","Y","."],["Y",".","."]]

 **Output:**  3

 **Explanation:** 

 **Example 2:** 

 **Input:**  grid = [["X","X"],["X","Y"]]

 **Output:**  0

 **Explanation:** 

No submatrix has an equal frequency of `'X'` and `'Y'`.

 **Example 3:** 

 **Input:**  grid = [[".","."],[".","."]]

 **Output:**  0

 **Explanation:** 

No submatrix has at least one `'X'`.

 

 **Constraints:** 

- 1 <= grid.length, grid[i].length <= 1000
- grid[i][j] is either 'X', 'Y', or '.'.

## Solution

**Language:** Java  
**Runtime:** 24 ms (beats 78.63%)  
**Memory:** 249.7 MB (beats 29.91%)  
**Submitted:** 2026-06-20T12:35:26.267Z  

```java
class Solution {
    public int numberOfSubmatrices(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] x = new int[m + 1][n + 1];
        int[][] y = new int[m + 1][n + 1];

        // build prefix sums
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                x[i][j] = x[i-1][j] + x[i][j-1] - x[i-1][j-1];
                y[i][j] = y[i-1][j] + y[i][j-1] - y[i-1][j-1];

                if (grid[i-1][j-1] == 'X') {
                    x[i][j]++;
                } 
                else if (grid[i-1][j-1] == 'Y') {
                    y[i][j]++;
                }
            }
        }

        int ans = 0;

        // submatrix (0,0) to (i,j)
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                int countX = x[i][j];
                int countY = y[i][j];

                if (countX == countY && countX > 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-submatrices-with-equal-frequency-of-x-and-y/)
# Solve Me First

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Complete the function  to compute the sum of two integers.

**Example**



Return .

**Function Description**

Complete the  function with the following parameters:

: the first value
: the second value

Returns
- : the sum of  and 

**Constraints**

**Sample Input**


```
a = 2
b = 3

```


**Sample Output**


```
5

```


**Explanation**

.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T10:29:37.073Z  

```cpp
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/solve-me-first/problem)
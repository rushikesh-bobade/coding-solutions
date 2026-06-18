# Pattern Syntax Checker

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Using** Regex**, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

**Note**: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

**Input Format**

The first line of input contains an integer , denoting the number of test cases. The next lines contain a string of any printable characters representing the pattern of a regex.

**Output Format**

For each test case, print `Valid` if the syntax of the given pattern is correct. Otherwise, print `Invalid`. Do not print the quotes.

**Sample Input**

```
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

```

**Sample Output**

```
Valid
Invalid
Invalid

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T15:03:19.424Z  

```cpp
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {

            String pattern = sc.nextLine();

            try {

                Pattern.compile(pattern);

                System.out.println("Valid");

            } catch (PatternSyntaxException e) {

                System.out.println("Invalid");
            }
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/pattern-syntax-checker/problem)
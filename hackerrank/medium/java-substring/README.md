# Java Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the *String* class' substring method helpful in completing this challenge.

**Input Format**

The first line contains a single string denoting .
The second line contains two space-separated integers denoting the respective values of  and .

**Constraints**

String  consists of English alphabetic letters (i.e., ) only.

**Output Format**

Print the substring in the inclusive range from  to .

**Sample Input**


```
Helloworld
3 7

```


**Sample Output**


```
lowo

```


**Explanation**

In the diagram below, the substring is highlighted in *green*:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T11:50:56.404Z  

```cpp
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-substring/problem)
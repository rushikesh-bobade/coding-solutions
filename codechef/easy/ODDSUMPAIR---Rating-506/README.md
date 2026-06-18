# ODDSUMPAIR - Rating 506

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Odd Sum Pair

Chef has 
3
3 numbers: 
𝐴
A, 
𝐵
B, and 
𝐶
C.

Chef wonders if it is possible to choose **exactly** two numbers out of the three numbers such that their sum is **odd**. Your task is to help Chef determine if such a pair exists.

Function Declaration
Function Name

𝑐
ℎ
𝑒
𝑐
𝑘
𝑂
𝑑
𝑑
𝑃
𝑎
𝑖
𝑟
𝑠
checkOddPairs – This function checks if any two numbers out of the three can form an odd sum.

Parameters
𝐴
A : an integer representing the first number.
𝐵
B : an integer representing the second number.
𝐶
C : an integer representing the third number.
Return Value

Returns a string: `"YES"` if it is possible to choose two numbers with an odd sum, otherwise returns `"NO"`.

Constraints:
1
≤
𝐴
,
𝐵
,
𝐶
≤
10
9
1≤A,B,C≤10
9

*The input and output formats provided below are only for testing with custom inputs. You only need to complete the core logic function.*

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of three space-separated integers: 
𝐴
A, 
𝐵
B, and 
𝐶
C.
Output Format
For each test case, output `YES` if you can choose exactly two numbers with odd sum, `NO` otherwise.
The output is case-insensitive. Thus, the strings `YES`, `yes`, `yeS`, and `Yes` are all considered the same.
Constraints
1
≤
𝑇
≤
100
1≤T≤100
1
≤
𝐴
,
𝐵
,
𝐶
≤
10
1≤A,B,C≤10
Sample 1:
Input
**
Output
**

```
4
1 2 3
8 4 6
3 3 9
7 8 6

```


```
YES
NO
NO
YES

```

Explanation:

**Test case 1:** Chef can choose 
2
2 and 
3
3 since 
2
+
3
=
5
2+3=5 and 
5
5 is odd.

**Test case 2:** It can be shown that Chef cannot choose two numbers among 
8
8, 
4
4 and 
6
6 with odd sum.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T10:18:42.662Z  

```cpp
class Solution {
    public String checkOddPairs(int A, int B, int C) {
        // write your code here
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ODDSUMPAIR)
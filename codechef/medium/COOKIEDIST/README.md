# COOKIEDIST

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Cookie distribution

You are a generous parent and have a collection of cookies to give to your children. Each child can receive **at most one cookie**.

Each child 
𝑖
i has a **greed factor** 
𝑔
[
𝑖
]
g[i], which is the minimum size of a cookie that will make the child happy. Each cookie 
𝑗
j has a **size** 
𝑠
[
𝑗
]
s[j]. A child will be content if the size of the cookie they receive is **greater than or equal to** their greed factor.

Your task is to **maximize the number of content children** and return that number.

Function Declaration
Function Name

𝑚
𝑎
𝑥
𝐶
𝑜
𝑛
𝑡
𝑒
𝑛
𝑡
𝐶
ℎ
𝑖
𝑙
𝑑
𝑟
𝑒
𝑛
maxContentChildren – This function calculates the maximum number of children that can be made content by distributing cookies such that each child receives at most one cookie, and the cookie size is at least the child’s greed factor.

Parameters
𝑔
g : A reference to an integer array representing the greed factor of each child.
𝑠
s : A reference to an integer array representing the sizes of available cookies.
Return Value
Returns an integer representing the maximum number of content children.
Constraints
1
≤
𝑇
≤
10
1≤T≤10
1
≤
𝑛
≤
3
×
10
4
1≤n≤3×10
4
 (number of children)
0
≤
𝑚
≤
3
×
10
4
0≤m≤3×10
4
 (number of cookies)
1
≤
𝑔
[
𝑖
]
,
𝑠
[
𝑗
]
≤
2
31
−
1
1≤g[i],s[j]≤2
31
−1
Input Format
The first line contains a single integer 
𝑇
T — the number of test cases.
For each test case:
The first line contains two integers 
𝑛
n and 
𝑚
m — number of children and number of cookies.
The next line contains 
𝑛
n integers — greed factors of the children.
The next line contains 
𝑚
m integers — sizes of the cookies.
Output Format
For each test case, output a single integer — the maximum number of content children.
Sample 1:
Input
**
Output
**

```
2
4 3
2 3 1 4
1 3 2
3 5
1 2 2
2 3 1 4 5
```


```
3
3
```

Explanation:

**Test case 1:** Children have greed factors `[2,3,1,4]` and cookies `[1,3,2]`.

Assign cookie 1 -> child with greed 1
Assign cookie 2 -> child with greed 2
Assign cookie 3 -> child with greed 3
The child with greed 4 cannot be satisfied. Maximum content children = 3

**Test case 2:** Children `[1,2,2]` and cookies `[2,3,1,4,5]`

Assign cookie 1 -> child with greed 1
Assign cookie 2 -> child with greed 2
Assign cookie 3 -> child with greed 2
All children are content. Maximum content children = 3

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T09:26:06.719Z  

```cpp
class Solution {
    public int maxContentChildren(int[] g, int[] s) {
        // write your code here 
        
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/COOKIEDIST)
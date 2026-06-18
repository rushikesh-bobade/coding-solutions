# EQUALELE - Rating 1123

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Equal Elements

You are given an array 
𝐴
A of size 
𝑁
N. In one operation, you can do the following:

Select indices 
𝑖
i and 
𝑗
j 
(
𝑖
≠
𝑗
)
(i

=j) and set 
𝐴
𝑖
=
𝐴
𝑗
A
i
	​

=A
j
	​

.

Find the **minimum** number of operations required to make all elements of the array **equal**.

Input Format
The first line of input will contain a single integer 
𝑇
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains an integer 
𝑁
N — the size of the array.
The next line contains 
𝑁
N space-separated integers, denoting the array 
𝐴
A.
Output Format

For each test case, output on a new line, the **minimum** number of operations required to make all elements of the array **equal**.

Constraints
1
≤
𝑇
≤
1000
1≤T≤1000
1
≤
𝑁
≤
2
⋅
10
5
1≤N≤2⋅10
5
1
≤
𝐴
𝑖
≤
𝑁
1≤A
i
	​

≤N
The sum of 
𝑁
N over all test cases won't exceed 
2
⋅
10
5
2⋅10
5
.
Sample 1:
Input
**
Output
**

```
3
3
1 2 3
4
2 2 3 1
4
3 1 2 4

```


```
2
2
3

```

Explanation:

**Test case 111:** The minimum number of operations required to make all elements of the array equal is 
2
2. A possible sequence of operations is:

Select indices 
1
1 and 
2
2 and set 
𝐴
1
=
𝐴
2
=
2
A
1
	​

=A
2
	​

=2.
Select indices 
3
3 and 
2
2 and set 
𝐴
3
=
𝐴
2
=
2
A
3
	​

=A
2
	​

=2.

Thus, the final array is 
[
2
,
2
,
2
]
[2,2,2].

**Test case 222:** The minimum number of operations required to make all elements of the array equal is 
2
2. A possible sequence of operations is:

Select indices 
3
3 and 
2
2 and set 
𝐴
3
=
𝐴
2
=
2
A
3
	​

=A
2
	​

=2.
Select indices 
4
4 and 
3
3 and set 
𝐴
4
=
𝐴
3
=
2
A
4
	​

=A
3
	​

=2.

Thus, the final array is 
[
2
,
2
,
2
,
2
]
[2,2,2,2].

**Test case 333:** The minimum number of operations required to make all elements of the array equal is 
3
3. A possible sequence of operations is:

Select indices 
2
2 and 
1
1 and set 
𝐴
2
=
𝐴
1
=
3
A
2
	​

=A
1
	​

=3.
Select indices 
3
3 and 
1
1 and set 
𝐴
3
=
𝐴
1
=
3
A
3
	​

=A
1
	​

=3.
Select indices 
4
4 and 
1
1 and set 
𝐴
4
=
𝐴
1
=
3
A
4
	​

=A
1
	​

=3.

Thus, the final array is 
[
3
,
3
,
3
,
3
]
[3,3,3,3].

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T11:59:43.128Z  

```cpp
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> freq = new HashMap<>();
            int maxFreq = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
                maxFreq = Math.max(maxFreq, freq.get(x));
            }

            System.out.println(n - maxFreq);
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EQUALELE)
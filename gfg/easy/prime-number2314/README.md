# Prime Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number **n**, determine whether it is a **prime number** or not.
**Note:** A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

**Examples :**


```
Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
```


```
Input: n = 25
Output: false
Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.
```


```
Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.
```


**Constraints:**
1 ≤ n ≤ 109

## Solution

**Language:** java (21)  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T10:17:25.350Z  

```java (21)
class Solution {
    static boolean isPrime(int n) {
        
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/prime-number2314/1)
# Count Subarrays With Majority Element I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` and an integer `target`.

Return the number of  **subarrays**  of `nums` in which `target` is the  **majority element**.

The  **majority element**  of a subarray is the element that appears  **strictly**   **more than half**  of the times in that subarray.

 

 **Example 1:** 

 **Input:**  nums = [1,2,2,3], target = 2

 **Output:**  5

 **Explanation:** 

Valid subarrays with `target = 2` as the majority element:

- nums[1..1] = [2]
- nums[2..2] = [2]
- nums[1..2] = [2,2]
- nums[0..2] = [1,2,2]
- nums[1..3] = [2,2,3]

So there are 5 such subarrays.

 **Example 2:** 

 **Input:**  nums = [1,1,1,1], target = 1

 **Output:**  10

 **Explanation:** 

 **​​​​​​​** All 10 subarrays have 1 as the majority element.

 **Example 3:** 

 **Input:**  nums = [1,2,3], target = 4

 **Output:**  0

 **Explanation:** 

`target = 4` does not appear in `nums` at all. Therefore, there cannot be any subarray where 4 is the majority element. Hence the answer is 0.

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- 1 <= nums[i] <= 10​​​​​​​9
- 1 <= target <= 109

## Solution

**Language:** Java  
**Runtime:** 27 ms (beats 80.00%)  
**Memory:** 47.1 MB (beats 40.92%)  
**Submitted:** 2026-06-25T18:31:03.420Z  

```java
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;

        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (nums[i] == target ? 1 : -1);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (prefix[j] > prefix[i]) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-subarrays-with-majority-element-i/)
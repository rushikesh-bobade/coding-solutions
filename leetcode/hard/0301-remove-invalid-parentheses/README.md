# Remove Invalid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string `s` that contains parentheses and letters, remove the minimum number of invalid parentheses to make the input string valid.

Return  *a list of  **unique strings**  that are valid with the minimum number of removals*. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "()())()"
Output: ["(())()","()()()"]

```

 **Example 2:** 

```
Input: s = "(a)())()"
Output: ["(a())()","(a)()()"]

```

 **Example 3:** 

```
Input: s = ")("
Output: [""]

```

 

 **Constraints:** 

- 1 <= s.length <= 25
- s consists of lowercase English letters and parentheses '(' and ')'.
- There will be at most 20 parentheses in s.

## Solution

**Language:** Java  
**Runtime:** 150 ms (beats 22.33%)  
**Memory:** 44.1 MB (beats 74.20%)  
**Submitted:** 2026-10-07T20:09:47.566Z  

```java
class Solution {

    private Set<String> answers = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        int openToRemove = 0;
        int closeToRemove = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                openToRemove++;
            } else if (ch == ')') {
                if (openToRemove > 0) {
                    openToRemove--;
                } else {
                    closeToRemove++;
                }
            }
        }

        build(s, 0, 0, openToRemove, closeToRemove, new StringBuilder());

        return new ArrayList<>(answers);
    }

    private void build(String s, int index, int balance,
                       int removeOpen, int removeClose,
                       StringBuilder current) {

        if (balance < 0) {
            return;
        }

        if (index == s.length()) {
            if (balance == 0 && removeOpen == 0 && removeClose == 0) {
                answers.add(current.toString());
            }
            return;
        }

        char ch = s.charAt(index);

        if (ch == '(') {
            // Remove this '(' if we still have some unnecessary '(' left.
            if (removeOpen > 0) {
                build(s, index + 1, balance,
                        removeOpen - 1, removeClose, current);
            }

            // Keep it.
            current.append(ch);
            build(s, index + 1, balance + 1,
                    removeOpen, removeClose, current);
            current.deleteCharAt(current.length() - 1);

        } else if (ch == ')') {
            // Remove this ')' if required.
            if (removeClose > 0) {
                build(s, index + 1, balance,
                        removeOpen, removeClose - 1, current);
            }

            // A ')' can only be kept when there is an unmatched '('.
            if (balance > 0) {
                current.append(ch);
                build(s, index + 1, balance - 1,
                        removeOpen, removeClose, current);
                current.deleteCharAt(current.length() - 1);
            }

        } else {
            current.append(ch);
            build(s, index + 1, balance,
                    removeOpen, removeClose, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-invalid-parentheses/)
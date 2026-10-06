# Score of Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a balanced parentheses string `s`, return  *the  **score**  of the string*.

The  **score**  of a balanced parentheses string is based on the following rule:

- "()" has score 1.
- AB has score A + B, where A and B are balanced parentheses strings.
- (A) has score 2 * A, where A is a balanced parentheses string.

 

 **Example 1:** 

```
Input: s = "()"
Output: 1

```

 **Example 2:** 

```
Input: s = "(())"
Output: 2

```

 **Example 3:** 

```
Input: s = "()()"
Output: 2

```

 

 **Constraints:** 

- 2 <= s.length <= 50
- s consists of only '(' and ')'.
- s is a balanced parentheses string.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.6 MB (beats 83.07%)  
**Submitted:** 2026-10-06T09:07:00.787Z  

```java
class Solution {
    public int scoreOfParentheses(String s) {
        // int low=0;
        // int high=0;

        // for(int i=0;i<s.length();i++){
        //     // if(s.charAt(i)=='('){
        //     //     low++;
        //     //     high++;
        //     // }else{
        //     //     high++;
        //     // }
        //     //  if(s.charAt(i)=='('){
        //     //     low++;
        //     // }else if(s.charAt(i)==')'){
        //     //     high++;

        //     //     if(low==high){
        //     //         high=2*low;
        //     //      }else{
        //     //     high=;
        //     //      }


        //     if(!st.isEmpty() && s.charAt(i)==')' && st.peek()=='(' ){
                
        //         if(high>1){
        //         ans=low*2;
        //         }else{
        //         ans++;
        //         low++;
        //         }

        //     }else{
        //         high++;
        //     }

        //     st.push(s.charAt(i));
        //     }
        // }
        // return high;


        int score = 0;
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                depth++;
            } else {
                depth--;

                // "()" -> 2^depth
                if (s.charAt(i - 1) == '(') {
                    score += 1 << depth;
                }
            }
        }

        return score;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/score-of-parentheses/)
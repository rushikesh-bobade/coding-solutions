# Valid Username Regular Expression

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:

The username consists of  to  characters inclusive. If the username consists of less than  or greater than  characters, then it is an invalid username.
The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .

For example:

Username	Validity
	INVALID; Username length < 8 characters
	VALID
	VALID
	INVALID; Username begins with non-alphabetic character
	INVALID; '?' character not allowed

Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.

Input Format

The first line of input contains an integer , describing the total number of usernames. Each of the next  lines contains a string describing the username. The locked stub code reads the inputs and validates the username.

Constraints

The username consists of any printable characters.

Output Format

For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.

Sample Input 0

8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007


Sample Output 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid


Explanation 0

Refer diagram in the challenge statement.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-17T20:01:50.738Z  

```cpp

class UsernameValidator {
    /*
     * Write regular expression here.
     */
        public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";

}


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/valid-username-checker/problem)
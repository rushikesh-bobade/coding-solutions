# COMPILER - Rating 1588

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Compilers and Parsers

For an expression to be valid, a “<” symbol must always have a corresponding “>” character somewhere (not necessary immediately) after it. Moreover, each “>” symbol should correspond to exactly one “<” symbol.

So, for instance, the instructions:

```
<>
<>
<><>

```

are all valid. While:

```
>>
><><

```

are not.

Given some expressions which represent some instructions to be analyzed, you should tell the length of the longest  **prefix**  of each of these expressions that is valid, or  **0**  if there's no such a prefix.

### Input

Input will consist of an integer  **T**  denoting the number of test cases to follow.

Then,  **T**  strings follow, each on a single line, representing a possible expression in L++.

### Output

For each expression you should output the length of the longest prefix that is valid or  **0**  if there's no such a prefix.

### Constraints
- 1 ≤ $T$ ≤ 500
- 1 ≤ The length of a single expression ≤ $10^6$
- The total size all the input expressions is no more than $5 * 10^6$
### Sample 1:
Input
Output

```
3
<<>>
><
<>>>
```

```
4
0
2
```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-20T12:25:16.559Z  

```cpp
import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        int T = Integer.parseInt(br.readLine().trim());

        while (T-- > 0) {

            String s = br.readLine().trim();

            int balance = 0;
            int longest = 0;

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                if (ch == '<') {
                    balance++;
                } else {
                    balance--;
                }

                // too many closing brackets
                if (balance < 0) {
                    break;
                }

                // valid prefix found
                if (balance == 0) {
                    longest = i + 1;
                }
            }

            ans.append(longest).append('\n');
        }

        System.out.print(ans);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/COMPILER)
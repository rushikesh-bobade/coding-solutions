# Between Two Sets

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

There will be two arrays of integers.  Determine all integers that satisfy the following two conditions:  

1. The elements of the first array are all factors of the integer being considered
2. The integer being considered is a factor of all elements of the second array

These numbers are referred to as being *between* the two arrays.  Determine how many such numbers exist.

**Example**  
$a = [2, 6]$  
$b = [24, 36]$  

There are two numbers between the arrays: $6$ and $12$.  
$6\%2 = 0$, $6\%6 = 0$, $24\%6 = 0$ and $36\%6 = 0$ for the first value.   
$12\%2 = 0$, $12\%6 = 0$ and $24\%12 = 0$, $36\%12 = 0$ for the second value.
Return $2$.

**Function Description**  

Complete the *getTotalX* function in the editor below.  It should return the number of integers that are betwen the sets.  

getTotalX has the following parameter(s):  

- *int a[n]*: an array of integers  
- *int b[m]*: an array of integers  

**Returns**  

- *int:* the number of integers that are between the sets


**Input Format**

The first line contains two space-separated integers, $n$ and $m$, the number of elements in arrays $a$ and $b$. 		
The second line contains $n$ distinct space-separated integers $a[i]$ where $0 \le i \lt n$. 		
The third line contains $m$ distinct space-separated integers $b[j]$ where $0 \le j \lt m$.


**Constraints**

- $1 \le n, m \le 10$
- $1 \le a[i] \le 100$
- $1 \le b[j] \le 100$

**Output Format**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-20T12:09:15.296Z  

```cpp
import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int lcm = a.get(0);

        // Find LCM of all elements in a
        for (int i = 1; i < a.size(); i++) {
            lcm = lcm(lcm, a.get(i));
        }

        int gcd = b.get(0);

        // Find GCD of all elements in b
        for (int i = 1; i < b.size(); i++) {
            gcd = gcd(gcd, b.get(i));
        }

        int count = 0;

        // Check numbers between LCM and GCD
        for (int i = lcm; i <= gcd; i += lcm) {
            if (gcd % i == 0) {
                count++;
            }
        }

        return count;
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}


public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
                new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput =
                bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr =
                Stream.of(bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr =
                Stream.of(bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/between-two-sets/problem)
# Left Rotation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A  operation on a circular array shifts each of the array's elements  unit to the left. The elements that fall off the left end reappear at the right end. Given an integer , rotate the array that many steps to the left and return the result.

**Example**



After  rotations, .

**Function Description**

Complete the  function with the following parameters:

: the amount to rotate by
: the array to rotate

**Returns**

: the rotated array

**Input Format**

The first line contains two space-separated integers that denote , the number of integers, and , the number of left rotations to perform.
The second line contains  space-separated integers that describe .

**Constraints**

**Sample Input**


```
STDIN      Function
-----      --------
5 4         n = 5 d = 4
1 2 3 4 5  arr = [1, 2, 3, 4, 5]

```


**Sample Output**


```
5 1 2 3 4

```


**Explanation**

To perform  left rotations, the array undergoes the following sequence of changes:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T10:11:50.079Z  

```cpp
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

    int n = arr.size();
    List<Integer> result = new ArrayList<>(n);

    // effective rotations
    d = d % n;

    // add elements from d to end
    for (int i = d; i < n; i++) {
        result.add(arr.get(i));
    }

    // add elements from start to d-1
    for (int i = 0; i < d; i++) {
        result.add(arr.get(i));
    }

    return result;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        List<Integer> result = Result.rotateLeft(d, arr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/array-left-rotation/problem)
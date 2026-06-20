# Array Manipulation

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.

 **Example** 

Queries are interpreted as follows:

```
    a b k
    1 5 3
    4 8 7
    6 9 1

```

Add the values of between the indices and inclusive:

The largest value is after all operations are performed.

 **Function Description** 

Complete the function with the following parameters:

- : the number of elements in the array
- : a two dimensional array of queries where each contains three integers,,, and.

 **Returns** 

- : the maximum value in the resultant array

 **Input Format** 

The first line contains two space-separated integers and, the size of the array and the number of queries.
Each of the next lines contains three space-separated integers, and, the left index, right index and number to add.

 **Constraints** 

-
-
-
-

 **Sample Input** 

```
STDIN       Function
-----       --------
5 3         arr[] size n = 5, queries[] size q = 3
1 2 100     queries = [[1, 2, 100], [2, 5, 100], [3, 4, 100]]
2 5 100
3 4 100

```

 **Sample Output** 

```
200

```

 **Explanation** 

After the first update the list is `100 100 0 0 0`.
After the second update list is `100 200 100 100 100`.
After the third update list is `100 200 200 200 100`.

The maximum value is.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-20T11:06:48.400Z  

```cpp
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

     public static long arrayManipulation(int n, List<List<Integer>> queries) {

        long[] diff = new long[n + 2];

        for (List<Integer> q : queries) {
            int a = q.get(0);
            int b = q.get(1);
            int k = q.get(2);

            diff[a] += k;

            if (b + 1 <= n) {
                diff[b + 1] -= k;
            }
        }

        long max = 0;
        long current = 0;

        for (int i = 1; i <= n; i++) {
            current += diff[i];
            max = Math.max(max, current);
        }

        return max;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result.arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/crush/problem)
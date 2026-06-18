# MOONSOON - Rating 1479

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### EVacuate to Moon

Pesla needs to charge $N$ cars before sending them to space. The $i^{th}$ car has an energy capacity $A_i$ Watt-hours.

There are $M$ power outlets. The $j^{th}$ outlet provides a power of $B_j$ Watt.
If an outlet can charge** at most** one car and a car can be charged by** at most** one outlet, find the** maximum** total energy (in Watt-hours) stored in all cars after $H$ hours.

Note:

- A power outlet cannot charge a different car even after completely charging a car.
- Energy is the product of power and time. For instance, a car can store $1$ Watt-hour of energy if it is charged at a power station with $1$ Watt power for $1$ hour.
### Input Format
- The first line of input will contain a single integer $T$, the number of test cases.
- The first line of each test case contains $3$ space-separated integers $N$, $M$, and $H$, the number of cars, the number of power outlets, and the number of hours respectively.
- The second line of each test case contains $N$ space-separated integers, the energy capacities (in Watt-hour) of the $N$ cars.
- The third line of each test case contains $M$ space-separated integers, the power (in Watt) of the $M$ power outlets.
### Output Format

For each test case, print the maximum total energy (in Watt-hours) stored in all cars after $H$ hours.

### Constraints
- $1 \leq T \leq 10^5$
- $1 \leq N, M, H, A_i, B_i\leq 10^5$
- The sum of $N$ over all test cases won't exceed $10^5$.
- The sum of $M$ over all test cases won't exceed $10^5$.
### Sample 1:
Input
Output

```
3
1 2 2
100
20 40
2 1 2
10 20
11
3 2 1
30 30 30
40 20

```

```
80
20
50

```

### Explanation:** Test case $1$:** We use the second power outlet to charge the car. After $2$ hours, $40\cdot2 = 80$ watt-hours of energy is stored in the car.** Test case $2$:** We use the power outlet to charge the second car. After $2$ hours, $11\cdot2 = 22$ watt-hours of energy is generated but since the car has the capacity of $20$, it will store only $20$ watt-hours of energy.** Test case $3$:** We use the first power outlet to charge the first car and second outlet to charge the second car. After $1$ hour, the first car will store $30$ watt-hours of energy (due to its maximum capacity) and second car will store $20$ watt-hours of energy.

Thus, the cars will store a total of $50$ watt-hours of energy.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T12:13:48.106Z  

```cpp
import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int h = sc.nextInt();

            long[] cars = new long[n];
            long[] outlets = new long[m];

            for (int i = 0; i < n; i++) {
                cars[i] = sc.nextLong();
            }

            for (int i = 0; i < m; i++) {
                outlets[i] = sc.nextLong() * (long) h;
            }

            Arrays.sort(cars);
            Arrays.sort(outlets);

            long ans = 0;

            int i = n - 1;
            int j = m - 1;

            while (i >= 0 && j >= 0) {
                ans += Math.min(cars[i], outlets[j]);
                i--;
                j--;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MOONSOON)
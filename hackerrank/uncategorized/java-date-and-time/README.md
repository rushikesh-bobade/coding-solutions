# Java Date and Time

![Difficulty](https://img.shields.io/badge/Difficulty-uncategorized-red)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-17T18:24:10.418Z  

```cpp
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

   public static String findDay(int month, int day, int year) {
    Calendar cal = Calendar.getInstance();
    cal.set(year, month - 1, day);

    String[] days = {
        "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
        "THURSDAY", "FRIDAY", "SATURDAY"
    };

    return days[cal.get(Calendar.DAY_OF_WEEK) - 1];
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-date-and-time/problem)
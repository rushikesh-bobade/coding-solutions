# Deque-STL

![Difficulty](https://img.shields.io/badge/Difficulty-uncategorized-red)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-17T18:22:22.559Z  

```cpp
    cout << endl;
}

int main() {
    int t;
    cin >> t;

    while (t--) {
        int n, k;
        cin >> n >> k;

        int arr[n];

        for (int i = 0; i < n; i++)
            cin >> arr[i];

        printKMax(arr, n, k);
    }

    return 0;
}
```

---

[View on HackerRank](https://www.hackerrank.com/challenges/deque-stl/problem)
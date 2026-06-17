# Attribute Parser

![Difficulty](https://img.shields.io/badge/Difficulty-uncategorized-red)

## Problem

_Description not available._

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-17T18:21:17.568Z  

```cpp
        while (ss >> attr) {
            ss >> eq >> value;

            value = value.substr(1, value.size() - 2);

            mp[path + "~" + attr] = value;
        }
    }

    while (q--) {
        string query;
        getline(cin, query);

        if (mp.find(query) != mp.end())
            cout << mp[query] << '\n';
        else
            cout << "Not Found!" << '\n';
    }

    return 0;
}
```

---

[View on HackerRank](https://www.hackerrank.com/challenges/attribute-parser/problem)
# Left View of Binary Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the **root **of a binary tree. Your task is to return the **left view** of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is **viewed** from the **left side**.

**Note:** If the tree is empty, return an empty list.

**Examples :**


```
Input: root = [1, 2, 3, 4, 5, N, N]

Output:[1, 2, 4]Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.
```


```
Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N]
Output: [1, 2, 4, 5]Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.
```


**Constraints:**
0 ≤ number of nodes ≤ 105
0 ≤ node -> data ≤ 105

## Solution

**Language:** java (21)  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-18T09:52:38.909Z  

```java (21)
/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {

    ArrayList<Integer> res = new ArrayList<>();

    public ArrayList<Integer> leftView(Node root) {
        dfs(root, 0);
        return res;
    }

    private void dfs(Node node, int level) {

        if (node == null) return;

        // first node of this level
        if (level == res.size()) {
            res.add(node.data);
        }

        // go left first (important for left view)
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1)
# Inserting a Node Into a Sorted Doubly Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a reference to the head of a doubly-linked list and an integer, $data$, create a new *DoublyLinkedListNode* object having data value $data$ and insert it at the proper location to maintain the sort.  

**Example**  

$head$ refers to the list $1 \leftrightarrow 2 \leftrightarrow 4 \rightarrow NULL$  
$data = 3$  

Return a reference to the new list: $1 \leftrightarrow 2 \leftrightarrow 3 \leftrightarrow 4 \rightarrow NULL$.

**Function Description**

Complete the *sortedInsert* function in the editor below.  

sortedInsert has two parameters:

- *DoublyLinkedListNode pointer head*: a reference to the head of a doubly-linked list 

- *int data*: An integer denoting the value of the $data$ field for the *DoublyLinkedListNode* you must insert into the list.

**Returns**  

- *DoublyLinkedListNode pointer:* a reference to the head of the list  

**Note:** Recall that an empty list (i.e., where $head = \texttt{NULL}$) and a list with one element *are* sorted lists. 

**Input Format**

The first line contains an integer $t$, the number of test cases.

Each of the test case is in the following format:  

- The first line contains an integer $n$, the number of elements in the linked list.  
- Each of the next $n$ lines contains an integer, the *data* for each node of the linked list.  
- The last line contains an integer, $data$, which needs to be inserted into the sorted doubly-linked list.

**Constraints**

- $1 \le t \le 10$  
- $1 \le n \le 1000$  
- $1 \le DoublyLinkedListNode.data \le 1000$

**Output Format**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-20T11:40:21.660Z  

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

class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}

class DoublyLinkedListPrintHelper {
    public static void printList(DoublyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class Result {

    /*
     * Complete the 'sortedInsert' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_DOUBLY_LINKED_LIST llist
     *  2. INTEGER data
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {

    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

    // Empty list
    if (llist == null) {
        return newNode;
    }

    // Insert before head
    if (data <= llist.data) {
        newNode.next = llist;
        llist.prev = newNode;
        return newNode;
    }

    DoublyLinkedListNode current = llist;

    // Find insertion position
    while (current.next != null && current.next.data < data) {
        current = current.next;
    }

    // Insert after current
    newNode.next = current.next;
    newNode.prev = current;

    if (current.next != null) {
        current.next.prev = newNode;
    }

    current.next = newNode;

    return llist;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                DoublyLinkedList llist = new DoublyLinkedList();

                int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

                IntStream.range(0, llistCount).forEach(i -> {
                    try {
                        int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

                        llist.insertNode(llistItem);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });

                int data = Integer.parseInt(bufferedReader.readLine().trim());

                DoublyLinkedListNode llist1 = Result.sortedInsert(llist.head, data);

                DoublyLinkedListPrintHelper.printList(llist1, " ", bufferedWriter);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem)
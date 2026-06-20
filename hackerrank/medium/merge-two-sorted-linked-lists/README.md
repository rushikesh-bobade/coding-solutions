# Merge two sorted linked lists

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

This challenge is part of a tutorial track by MyCodeSchool

Given pointers to the heads of two sorted linked lists, merge them into a single, sorted linked list. Either head pointer may be null meaning that the corresponding list is empty.

 **Example** 
refers to
refers to

The new list is

 **Function Description** 

Complete the  *mergeLists*  function in the editor below.

 *mergeLists*  has the following parameters:

- SinglyLinkedListNode pointer headA: a reference to the head of a list
- SinglyLinkedListNode pointer headB: a reference to the head of a list

 **Returns** 

- SinglyLinkedListNode pointer: a reference to the head of the merged list

 **Input Format** 

The first line contains an integer, the number of test cases.

The format for each test case is as follows:

The first line contains an integer, the length of the first linked list.
The next lines contain an integer each, the elements of the linked list.
The next line contains an integer, the length of the second linked list.
The next lines contain an integer each, the elements of the second linked list.

 **Constraints** 

-
-
-, where is the element of the list.

 **Sample Input** 

```
1
3
1
2
3
2
3
4

```

 **Sample Output** 

```
1 2 3 3 4 

```

 **Explanation** 

The first linked list is:

The second linked list is:

Hence, the merged linked list is:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-06-20T11:20:23.276Z  

```cpp
import java.io.*;
import java.util.*;

public class Solution {

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        SinglyLinkedListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static SinglyLinkedListNode mergeLists(
            SinglyLinkedListNode head1,
            SinglyLinkedListNode head2) {

        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode tail = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }

            tail = tail.next;
        }

        if (head1 != null)
            tail.next = head1;
        else
            tail.next = head2;

        return dummy.next;
    }

    static SinglyLinkedListNode insert(
            SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (head == null)
            return node;

        SinglyLinkedListNode temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = node;

        return head;
    }

    static void printList(SinglyLinkedListNode head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());
            SinglyLinkedListNode head1 = null;

            for (int i = 0; i < n; i++) {
                head1 = insert(head1,
                        Integer.parseInt(br.readLine()));
            }

            int m = Integer.parseInt(br.readLine());
            SinglyLinkedListNode head2 = null;

            for (int i = 0; i < m; i++) {
                head2 = insert(head2,
                        Integer.parseInt(br.readLine()));
            }

            SinglyLinkedListNode result =
                    mergeLists(head1, head2);

            printList(result);
            System.out.println();
        }
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem)
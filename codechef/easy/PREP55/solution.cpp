/* Linked List Node
struct Node {
    int data;
    struct Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}; */

class Solution {
    Node removeDuplicates(Node head) {
        Node curr = head;

        while (curr != null && curr.next != null) {
            // If duplicate found
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
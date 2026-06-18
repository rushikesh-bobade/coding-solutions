

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
   static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

    // Point new node to current head
    newNode.next = llist;

    // New node becomes the head
    return newNode;
}

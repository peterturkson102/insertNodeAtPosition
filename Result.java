class Result {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
SinglyLinkedListNode preNode = llist;
        for(int i = 0; i < position - 1; i++){
            preNode = preNode.next;
        }
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.next = preNode.next;
        preNode.next = node;
        return llist;
    }

}

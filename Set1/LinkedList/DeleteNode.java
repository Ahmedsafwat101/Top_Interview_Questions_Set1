package LinkedList;
 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode(){};
      ListNode(int x) { val = x; }
 }
public class DeleteNode {
    public void deleteNode(ListNode node) {
       node.val=node.next.val;
       node.next=node.next.next;
    }
}

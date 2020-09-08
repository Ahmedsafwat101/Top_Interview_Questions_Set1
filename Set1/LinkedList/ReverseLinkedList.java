package LinkedList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current!=null){
            next= current.next;
            current.next= prev;
            prev=current;
            current=next;
        }
        return prev;
    }
}

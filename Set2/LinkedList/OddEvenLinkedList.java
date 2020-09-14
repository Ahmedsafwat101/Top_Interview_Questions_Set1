package LinkedList;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
      if(head==null) return null;
      if(head.next==null ||head.next.next==null) return head;
      ListNode odd= head;
      ListNode even= head.next;
      ListNode dummy= head.next;

      while (dummy!=null && odd!=null && dummy.next!=null && odd.next!=null ){
          odd.next= dummy.next;
          odd=dummy.next;
          dummy.next=odd.next;
          dummy=odd.next;
      }
      odd.next=even;
      return head;
    }
}

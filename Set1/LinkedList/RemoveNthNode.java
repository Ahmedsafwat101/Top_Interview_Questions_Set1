package LinkedList;

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode dummy1= head;
        while (dummy1!=null){
            dummy1=dummy1.next;
            count++;
        }

        count-=n;
        ListNode newHead= new ListNode(0);
        newHead.next=head;
        ListNode current= newHead;
        while (count>0){
            current=current.next;
            count--;
        }
        current.next=current.next.next;
        return newHead.next;
    }
 }


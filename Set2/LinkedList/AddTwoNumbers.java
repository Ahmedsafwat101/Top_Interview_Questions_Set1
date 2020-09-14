package LinkedList;

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode result = new ListNode(0);
        ListNode dummyHead = result;
        int cary = 0;
        int sum = 0;

        while (l1 != null || l2 != null) {
            int fvalue=0;
            int svalue=0;
            if(l1!=null)
                fvalue=l1.val;
            if(l2!=null)
                svalue=l2.val;
            sum = fvalue+ svalue+ cary;
            cary = sum/10;
            dummyHead.next= new ListNode(sum%10);
            dummyHead=dummyHead.next;
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if(cary>0){
            dummyHead.next= new ListNode(cary);
        }

        return result.next;
    }
}

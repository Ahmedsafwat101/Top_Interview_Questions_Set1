package LinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;

        ListNode startOfSecondHalf= halfOfList(head);
        ListNode reverseSecondHalf= reverse(startOfSecondHalf.next);
        ListNode dummyHead= head;
        while (dummyHead!=null && reverseSecondHalf!=null){
            if(dummyHead.val!=reverseSecondHalf.val)
                return false;
        }
        return true;

    }
    private ListNode halfOfList(ListNode head){
        if(head==null) return null;

        ListNode slow= head;
        ListNode fast= head;
        while (fast.next!=null && fast.next.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        if(head==null) return null;

        ListNode current= head;
        ListNode prev=null;
        ListNode next= null;

        while (current != null) {
            next=current.next;
            current.next= prev;
            prev=current;
            current= next;
        }
        return prev;
    }

}

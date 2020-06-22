package Test20;

import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode big = new ListNode(0);
        ListNode small = new ListNode(0);
        ListNode smallTail = small;
        ListNode bigTail = small;
        for(ListNode cur = pHead;cur != null;cur = cur.next){
            if(cur.val>x){
                bigTail.next = cur;
                bigTail = bigTail.next;
            }else{
                smallTail.next = cur;
                smallTail = smallTail.next;
            }
            cur = cur.next;
        }
        smallTail.next = big.next;
        ListNode newHead = smallTail.next;
        return newHead;
    }
}

package day4;

import Node.ListNode;

//反转链表

public class ReverseList {

    private static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode post = head.next;
        while (post != null) {
            cur.next = prev;
            prev = cur;
            cur = post;
            post = post.next;
        }
        cur.next = prev;
        return cur;
    }

    private static ListNode reverse2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newhead = null;
        while(head != null){
            ListNode p = head;
            head = head.next;
            p.next = newhead;
            newhead = p;
        }
        return  newhead;
    }
}

package day;

import Node.ListNode;

public class DeleteNode {
    public ListNode deleteDuplication(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = new ListNode(0);
        ListNode tail = newHead;
        while(head!=null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                head = head.next;
            }else{
                tail.next = new ListNode(head.val);
                head = head.next;
                tail = tail.next;
            }
        }
        return newHead.next;
    }
}

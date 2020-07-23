package day4;

import Node.ListNode;

//合并链表
//输入两个单调递增的链表，输出两个链表合成后的链表，我们需要合成后的链表满足单调不减
public class MergeList {
    private static ListNode mergeTest(ListNode A, ListNode B){
        if(A == null){
            return B;
        }
        if(B == null){
            return A;
        }
        ListNode newHead = new ListNode(0);
        ListNode tail = newHead;
        while(A!=null&&B!=null){
            if(A.val>B.val){
                tail.next = B;
                B = B.next;
            }else{
                tail.next = A;
                A = A.next;
            }
            tail = tail.next;
        }
        if(A == null){
            tail.next = B;
        }
        if(B == null){
            tail.next = A;
        }
        return newHead.next;
    }
}

package day4;

import Node.ListNode;

public class KList {
    //输出链表的第K个结点
    /*
    public ListNode FindKthToTail(ListNode head, int k) {
        if(head == null){
            return null;
        }
        int size = getSize(head);
        if(k<=0||k>size){
            return null;
        }
        int step = size - k;
        for(int i = 0;i<step;i++){
            head = head.next;
        }
        return head;
    }

    private int getSize(ListNode head) {
        int count = 0;
        while(head!= null){
            count++;
            head = head.next;
        }
        return count;
    }
     */
    public ListNode FindKthToTail(ListNode head,int k){
        if(head == null||k<=0){
            return null;
        }
        ListNode front = head;
        ListNode rear = head;
        while(k>0&&front!=null){
            front = front.next;
            k--;
        }
        while(front!=null){
            front = front.next;
            rear = rear.next;
        }
        return k>0?null:rear;
    }
}

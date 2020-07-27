package day;

import Node.ListNode;

public class FistNode {
    public ListNode FindFirstCommonNode(ListNode A, ListNode B) {
        int lengthA = getLengthOfList(A);
        int lengthB = getLengthOfList(B);
        if(lengthA<lengthB){
            for(int i = 0;i<lengthB - lengthA;i++){
                B = B.next;
            }
        }else{
            for(int i = 0;i<lengthA - lengthB;i++){
                A = A.next;
            }
        }
        while(A != null&&B!=null){
            if(A == B){
                return A;
            }
            A = A.next;
            B = B.next;
        }
        return null;
    }

    private int getLengthOfList(ListNode A) {
        int size = 0;
        while(A!= null){
            A = A.next;
            size++;
        }
        return size;
    }
}

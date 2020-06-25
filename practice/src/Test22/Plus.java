package Test22;
import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        ListNode newHead = new ListNode(0);
        ListNode tail = newHead;
        int flag = 0;

        while (a != null && b != null) {
            int va = (a == null ? 0 : a.val);
            int vb = (b == null ? 0 : b.val);

            int sum = va + vb;
            flag = sum / 10;
            tail.next = new ListNode(sum);
            tail = tail.next;
        }
        if(a!= null){
            a=a.next;
        }
        if(b != null){
            b = b.next;
        }
        if(flag != 0){
            tail.next = new ListNode(1);
        }
        return newHead.next;
    }
}

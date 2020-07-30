package day;

import Node.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class PrintList {
    //方法一：利用栈
    public ArrayList<Integer> printListFromTailToHead(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

    //方法二：逆置数组
    public ArrayList<Integer> printListFromTailToHead2(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.val);
            head = head.next;
        }
        int left = 0;
        int right = list.size()-1;
        while(left<right){
            int t = list.get(left);
            list.set(left,list.get(right));
            list.set(right,t);
            left++;
            right--;
        }
        return list;
    }

    //方法三：递归实现
     public ArrayList<Integer> printListFromTailToHead3(ListNode head) {
            ArrayList<Integer> list = new ArrayList<>();
            helper(head,list);
            return list;
     }

    private void helper(ListNode head, ArrayList<Integer> list) {
        if(head == null){
            return;
        }
        helper(head.next,list);
        list.add(head.val);
    }
}

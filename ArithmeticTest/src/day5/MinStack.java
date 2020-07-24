package day5;

import java.util.Stack;

public class MinStack {

    Stack<Integer> A = new Stack<>(); //用于存放数据
    Stack<Integer> B = new Stack<>();//用于存放栈中的最小值

    public void push(int node) {
        A.push(node);
        if(B.isEmpty()){
            B.push(node);
        }else{
            int min = B.peek();
            if(min >node){
                B.push(node);
            }else{
                B.push(min);
            }
        }
    }

    public void pop() {
        if(A.isEmpty()){
            return;
        }
        A.pop();
        B.pop();
    }

    public Integer top() {
        if(A.isEmpty()){
            return null;
        }
        return A.peek();
    }

    public Integer min() {
        if(B.isEmpty()){
            return null;
        }
        return B.peek();
    }
}

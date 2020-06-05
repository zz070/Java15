package Test05;

import java.util.Stack;

public class MyQueueByTwoStack {
    /*
    思路：
           栈的特点：先进后出；队列的特点：先进先出
           创建两个栈A,B；A用于入队列，B用于出队列
           1、入队
                (1)若栈B不为空，先将B中的元素全部放到A中
                (2)将要入队的元素放入A中
           2、出队
                (1)若队列为空，直接返回null；
                (2)若栈A不为空，先将A中的元素全部放到B中
                (3)将B的栈顶元素出栈即可
           3、判断队空
                若两个栈全部为空，即队列为空
     */
    Stack<Integer> A = new Stack<Integer>();
    Stack<Integer> B = new Stack<Integer>();

    public void push(int node) {
        while(!B.isEmpty()){
           int temp = B.pop();
           A.push(temp);
        }
        A.push(node);
    }

    public Integer pop() {
        if(empty()){
            return null;
        }
        while(!A.empty()){
            int temp = A.pop();
            B.push(temp);
        }
       return B.pop();
    }
    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }
}

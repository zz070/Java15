package MyCollection;

import java.util.Stack;

public class MyQueueByTwoStack {

    //用两个栈实现队列
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
           3、取队顶元素
                (1)若队列为空，直接返回null；
                (2)若栈A不为空，先将A中的元素全部放到B中
                (3)取B的栈顶元素即可
           4、判断队空
                若两个栈全部为空，即队列为空
     */

    //先创建两个栈
    Stack<Integer> A = new Stack<>();
    Stack<Integer> B = new Stack<>();
    //1、入队
    public void offer(int x){
        //若栈B不为空，先将B中的元素全部放到A中
        if(!B.isEmpty()){
            int temp = B.pop();
            A.push(temp);
        }
        A.push(x);
    }
    //2、出队
    public Integer poll(){
        if(empty()){
            return null;
        }
        if(!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.pop();
    }
    //3、取队顶元素
    public Integer peek(){
        if(empty()){
            return null;
        }
        if(!A.isEmpty()){
            int tmp = A.pop();
            B.push(tmp);
        }
        return B.peek();
    }
    //4、判断队空
    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }
}

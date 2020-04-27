package MyCollection;

import java.util.Stack;

public class MinStack {
    /*
    题目要求：
        设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
            push(x) —— 将元素 x 推入栈中。
            pop() —— 删除栈顶的元素。
            top() —— 获取栈顶元素。
            getMin() —— 检索栈中的最小元素。

    思路：
        创建两个栈A,B，A用于存放用于存放正常数据，B用于存放A中的最小值
        1、入栈
            (1)将要入栈的数直接入到A中；
            (2)此时，若B为空，将该数再次入到B中；
            (3)若B不为空，则取B的栈顶元素，与该数进行比较，将较小的数入到B中
        2、出栈
            (1)若A为空，直接返回null
            (2)A不为空，A，B同时出栈
        3、取栈顶元素
            (1)A为空,直接返回null
            (2)A不为空，直接取A的栈顶元素
        4、检索栈中最小值
            (1)B为空，直接返回null
            (2)B不为空，直接取B的栈顶元素
     */

    //A用于存放用于存放正常数据，B用于存放A中的最小值
    private Stack<Integer> A = new Stack<>();
    private Stack<Integer> B = new Stack<>();

    //入栈
    public void push(int x) {
        A.push(x);
        //B为空
        if(B.isEmpty()){
            B.push(x);
            return;
        }
        //B不为空
        int min = B.peek();
        if(x< min){
            min = x;
        }
        B.push(min);
    }

    //出栈
    public Integer pop() {
        if(A.isEmpty()){
            return null;
        }
        B.pop();
        return A.pop();
    }

    //取栈顶元素
    public Integer top() {
        if(A.isEmpty()){
            return null;
        }
        return A.peek();
    }

    //取最小元素
    public Integer getMin() {
        if(B.isEmpty()){
            return null;
        }
        return B.peek();
    }
}

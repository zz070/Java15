package Test05;

import java.util.Stack;

public class QueueByStack {
    /*
    A用于入队，B用于出队
    （1）入队
            若B为空，直接入到A；
            若B不为空，先将B中的元素放到A中，再将新元素放到A中
     （2）出队
            若两个栈都为空，直接返回null
            若A不为空，将A中元素全部放到B中，再将栈顶元素出栈
      （3）取栈顶元素
                类似出队
      （4）判队空
     */
    Stack<Integer> A = new Stack<Integer>();
    Stack<Integer> B = new Stack<Integer>();

    public void push(int x) {
        while (!B.isEmpty()) {
            int t = B.pop();
            A.push(t);
        }
        A.push(x);
    }

    public Integer pop() {
        if(empty()){
            return null;
        }
        while(!A.isEmpty()){
            int t = A.pop();
            B.push(t);
        }
        return B.pop();
    }
    public Integer peek(){
        if(empty()){
            return null;
        }
        while(!A.isEmpty()){
            int t = A.pop();
            B.push(t);
        }
        return B.peek();
    }
    public boolean empty(){
        return A.isEmpty()&&B.isEmpty();
    }
}

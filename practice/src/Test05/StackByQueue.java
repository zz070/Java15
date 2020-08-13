package Test05;

import java.util.LinkedList;
import java.util.Queue;

//用两个 队列实现栈
public class StackByQueue {
    /*
    用两个队列实现栈
    （1）入栈
        将元素直接入队A
    （2）出栈
        ①队列为空，直接返回null；
        ②A中的最后一个元素即为栈顶元素
            将A中元素出队，放到B中，A中最后一个元素即为栈顶元素，将其出队即可
            交换A，B队列
    （3）取栈顶元素
            步骤同出栈，只是将A中最后一个元素返回后，再将该元素放到B中即可
    （4）判断栈为空
            A，B全为空，栈才为空
     */
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();
    public void push(int x){
        A.offer(x);
    }
    public Integer pop(){
        if(empty()){
            return null;
        }
        while(A.size()>1){
            int t = A.poll();
            B.offer(t);
        }
        int ret = A.poll();
        swap(A,B);
        return ret;
    }
    public Integer peek(){
        if(empty()){
            return null;
        }
        while(A.size()>1){
            int t = A.poll();
            B.offer(t);
        }
        int ret = A.poll();
        B.offer(ret);
        swap(A,B);
        return ret;
    }

    private void swap(Queue<Integer> a, Queue<Integer> b) {
        Queue<Integer> t = a;
       a = b;
       b = t;
    }


    private boolean empty() {
        return  A.isEmpty()&&B.isEmpty();
    }
}

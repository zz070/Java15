package MyCollection;

import java.util.LinkedList;
import java.util.Queue;

public class MyStackByTwoQueue {

    //用两个队列实现栈
    /*
    思路：
           栈的特点：先进后出；队列的特点：先进先出
           创建两个队列A,B;
           1、入栈
                直接在A中入栈即可
           2、出栈
                （1）若栈为空，直接返回null；
                （2）队列A中的最后一个元素，即为栈顶元素；
                        a.将A出队列转移到B
                        b.将A中最后一个元素，出队列即可（记为ret）
               （3）交换AB队列方便下一步操作；
               （4）返回栈顶元素ret
           3、取栈顶元素
                   (1）若栈为空，直接返回null；
                （2）队列A中的最后一个元素，即为栈顶元素；
                        a.将A出队列转移到B
                        b.将A中最后一个元素，出队列（记为ret）
                        c.将ret入队B（和出栈唯一不同的操作）
               （3）交换AB队列方便下一步操作；
              （4）返回栈顶元素ret
           4、判断栈空
                若两个队列全部为空，则栈为空
     */

    //创建两个队列
    Queue<Integer> A = new LinkedList<>();
    Queue<Integer> B = new LinkedList<>();

    //1、入栈
    public void push(int x){
        A.offer(x);
    }
    //2、出栈
    public Integer pop(){
        if(empty()){
            return null;
        }
        while(A.size()>1){
            int temp = A.poll();
            B.offer(temp);
        }
        int ret = A.poll();
        swap();
        return ret;
    }

    private void swap() {
        Queue<Integer> temp = A;
        A = B;
        B = temp;
    }

    //3、取栈顶元素
    public Integer peek(){
        if(empty()){
            return null;
        }
        while(A.size()>1){
            int temp = A.poll();
            B.offer(temp);  //和出栈唯一不同的操作
        }
        int ret = A.poll();
        B.offer(ret);
        swap();
        return ret;
    }
    //4、判断栈空
    public boolean empty(){
        return A.isEmpty() && B.isEmpty();
    }
}

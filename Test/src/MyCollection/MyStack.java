package MyCollection;

public class MyStack {
    //使用数组来表示一个栈
    //不考虑扩容问题
    private int[] array = new int[100];
    private int size = 0;

    //入栈
    public void push(int x){
        array[size] = x;
        size++;
    }
    //取栈顶元素
    public int peek(){
        return array[size-1];
    }
    //出栈
    public int pop(){
        int ret = array[size - 1];
        size--;
        return ret;
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    //栈中元素个数
    public int size(){
        return size;
    }
}

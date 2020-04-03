package MyCollection;

public class MyQueueByArray {
    // [head, tail) 有效元素的范围. 其中, tail 可能在 head 之前
    private int[] array = new int[100];
    private int head = 0;           // 队首元素下标
    private int tail = 0;            // 对位元素下标
    private int size = 0;          //元素个数

    //入队
    public void offer(int x){
        //如果队满，就不能进行入队操作
        if(size == array.length){
            return;
        }
        array[size] = x;
        tail++;
        //如果执行tail++操作后，超出数组的有效范围，就从头开始
        if(tail >= size){
            tail = 0;
        }
        size++;
    }

    //出队列
    public Integer poll(){
        //如果队为空
        if(size == 0){
            return null;
        }
        Integer ret = array[head];
        head ++;
        //如果执行head++操作后，超出数组有效范围，从头开始
        if(head >= array.length){
            head = 0;
        }
        size--;
        return ret;
    }

    //取队首元素
    public Integer peek(){
        if(size == 0){
            return null;
        }
        return array[head];
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //队列中元素个数
    public int size(){
        return size;
    }
}

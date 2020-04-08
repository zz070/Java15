package MyHeap;

public class MyPriorityQueue {

    private int[] array = new int[100];
    private int size = 0;

    //向上调整，建一个大堆
    private static void shiftUp(int[] array,int index){
        int child = index;
        int parent = (child - 1)/2;
        while(child > 0){
            if(array[child] >array[parent]){
                int temp = array[child];
                array[child] = array[parent];
                array[parent] = temp;
            }
            child = parent;
            parent = (child -1)/2;
        }
    }
    //向下调整建一个大堆
    private static void shiftDown(int[] array,int size,int index){
        int parent = index;
        int child = parent * 2 + 1;
        while(child<size){
            if( child+1 < size && array[child+1]>array[child]){
                child++;
            }
            if(array[child] >array[parent]){
                int temp = array[child];
                array[child] = array[parent];
                array[parent] = temp;
            }
            parent = child;
            child = parent * 2 + 1;
        }
    }
    //入队
    public void offer(int x){
        array[size] = x;
        size ++;
        shiftUp(array,size-1);
    }
    //出队
    public int poll(){
        int pollValue = array[0];
        array[0] = array[size -1];
        size --;
        shiftDown(array,size,0);
        return pollValue;
    }
    //取队首元素
    public int peek(){
        return array[0];
    }
    //判断队是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(3);
        queue.offer(6);
        queue.offer(8);

        System.out.print("出队：");
        while (!queue.isEmpty()) {
            System.out.println();
            int cur = queue.poll();
            System.out.print(cur);
            System.out.println();
            System.out.print("取队首元素：");
            System.out.print(queue.peek());
            System.out.println();
            System.out.print("判断队是否为空：");
            System.out.print(queue.isEmpty());
            System.out.println("\n");
        }
    }
}

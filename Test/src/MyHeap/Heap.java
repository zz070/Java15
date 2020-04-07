package MyHeap;

import java.util.Arrays;

public class Heap {
    //向下调整，此处以小堆为例
    public static void shiftDown(int[] array, int size, int index){
        int parent = index;
        int child = parent*2+1;  //该下标是根据parent找到的左子树的下标
        while(child < size){
            //如果右子树存在，比较右子树和左子树值的大小，找到较小的那一个
            if(child + 1< size  &&  array[child +1] < array[child]){
                child++;
            }
            //如果孩子结点的值小于双亲节点的值，交换节点元素
            if(array[child]< array[parent]){
                int temp = array[child];
                array[child] = array[parent];
                array[parent] = temp;
            }
            //更新parent和child的下标
            parent = child;
            child = parent * 2 + 1;
        }
    }

    //向下调整，以建大堆为例
    public static void shiftDownBig(int[] array, int size, int index){
        int parent = index;
        int child = parent*2+1;  //该下标是根据parent找到的左子树的下标
        while(child < size){
            //如果右子树存在，比较右子树和左子树值的大小，找到较大的那一个
            if(child + 1< size  &&  array[child +1] >array[child]){
                child++;
            }
            //如果孩子结点的值大于双亲节点的值，交换节点元素
            if(array[child] > array[parent]){
                int temp = array[child];
                array[child] = array[parent];
                array[parent] = temp;
            }
            //更新parent和child的下标
            parent = child;
            child = parent * 2 + 1;
        }
    }


    //建一个小堆
    public static void createHeap(int[] array,int size){
        for(int i = (size-1-1)/2;i >=0;i--){
            shiftDown(array,size,i);
        }
    }

    //建一个大堆
    public static void createHeapBig(int[] array,int size){
        for(int i = (size-1-1)/2;i >=0;i--){
            shiftDownBig(array,size,i);
        }
    }

    public static void main(String[] args) {
        int[] array = {9, 5, 2, 7, 3, 6, 8};
        System.out.print("建一个小堆：");
        createHeap(array, array.length);
        System.out.println(Arrays.toString(array));
        System.out.print("建一个大堆：");
        createHeapBig(array, array.length);
        System.out.println(Arrays.toString(array));
    }
}

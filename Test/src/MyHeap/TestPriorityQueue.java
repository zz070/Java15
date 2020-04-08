package MyHeap;

import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.offer(9);
        queue.offer(5);
        queue.offer(2);
        queue.offer(7);
        queue.offer(3);
        queue.offer(6);
        queue.offer(8);

        //每出队一次，就取一次队首元素，判断一次队是否为空
        System.out.print("出队：");
        while(!queue.isEmpty()){
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

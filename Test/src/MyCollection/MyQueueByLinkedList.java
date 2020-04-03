package MyCollection;

public class MyQueueByLinkedList {
    // Node 这个类叫做 "内部类" . 定义在某个类或者方法中的类
    // static 效果就是: 创建 Node 的实例不依赖 MyQueueByLinkedList 这个类的实例
    static class Node {
        public int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    // 创建一个链表, 就得有头结点. 此处 head 节点不是傀儡节点
    // 基于链表来实现队列, 可以入队列从尾部插入, 出队列从头部删除; 也可以如队列从头部插入, 出队列从尾部删除
    // 无论是那种实现方式, 最好都把头和尾都记录下来.
    Node head = null;
    Node tail = null;

    // 此处按照尾部入队列, 头部出队列的方式实现

    // 入队列
    public void offer(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
    }

    //出队列
    public Integer poll(){
        if(head == null){
            return null;
        }
        int ret = head.val;
        head = head.next;
        //此时若head == null,说明队列为空
        if(head == null){
            tail = null;
        }
        return ret;
    }

    //取队首元素
    public Integer peek(){
        if(head == null){
            return null;
        }
        return head.val;
    }
}

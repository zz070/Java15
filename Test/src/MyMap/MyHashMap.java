package MyMap;

//通过开散列的方式处理hash冲突
public class MyHashMap {
    static class Node{
        int key;
        int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final double LOAD_FACTOR = 0.75;
    //array表示hash表，数组的每一个元素是一个链表的头结点
    Node[] array = new Node[101];
    //size表示hash表中元素的个数
    int size = 0;

    //获取存入元素hash值的方法
    private int hashFunc(int key){
        return key%array.length;
    }

    //将元素插入到array中
    /*
    1、将 key 映射为 array 中对应下标
    2、根据下标找到对应链表
    3、判断当前 key 链表中是否存在
            （1）若key已存在直接修改value即可
            （2）不存在，直接插入到指定位置即可
     */
    public void put(int key, int value){
        int index = hashFunc(key);
        Node list = array[index];
        for(Node cur = list;cur != null;cur = cur.next){
            if(cur.key == key){
                cur.value = value;
                return;
            }
        }
        Node newNode = new Node(key,value);
        newNode.next = list;
        array[index] = newNode;
        size++;

        //若hash表容量不足，进行扩容操作
        if(size/array.length>LOAD_FACTOR){
            resize();
        }
    }

    private void resize() {
        Node[] newArray = new Node[array.length*2];
        for(int i =0; i<array.length;i++){
            for(Node cur = array[i];cur != null;cur = cur.next){
                int index = cur.key/newArray.length;
                Node newNode = new Node(cur.key, cur.value);
                newNode.next = newArray[index];
                newArray[index] = newNode;
            }
        }
        array = newArray;
    }

    public Integer get(int key) {
        // 1. 先计算出 key 对应的下标
        int index = hashFunc(key);
        // 2. 根据下标找到对应的链表
        Node list = array[index];
        // 3. 在链表中查找指定元素
        for (Node cur = list; cur != null; cur = cur.next) {
            if (cur.key == key) {
                return cur.value;
            }
        }
        return null;
    }
}

package MyMap;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    //复制带有随机指针的链表

    /*
    题目描述:
            给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
            要求返回这个链表的 深拷贝。

    思路：
            1、遍历原链表，将原链表插入到map中，key表示就链表的结点，value表示拷贝出来的新结点
            2、再次遍历链表，修改新链表中的next和random
            3、最后，新链表的头结点即可
     */
    public Node copyRandomList(Node head){
        Map<Node,Node> map = new HashMap<>();
        for(Node cur = head; cur != null;cur = cur.next){
            map.put(cur,new Node(cur.val));
        }
        for(Node cur = head; cur != null;cur = cur.next){
            Node newNode = map.get(cur);
            newNode.next = map.get(cur.next);
            newNode.random = map.get(cur.random);
        }
        return map.get(head);
    }
}

package Tree;

//搜索二叉树的相关操作
/*
    1、查找
    2、插入
    3、删除
 */

public class BinarySearchTree {

    //二叉树的结构
    public static class Node{
        int key;
        Node left;
        Node right;

        public Node(int key){
            this.key = key;
        }
    }

    private Node root = null;

    //查找

    /*
    思路:
           树不为空的情况下：
                1、key小于根节点的值，去左子树找；
                2、key大于根节点的值，去右子树找；
                3、相等，就找到了，返回该节点
           若都没找到，即key不存在，返回null
     */

    public Node find(int key){
        Node cur = root;
        while(root != null){
            if(key < root.key){
                root = root.left;
            }else if(key > root.key){
                root = root.right;
            }else {
                return root;
            }
        }
        return null;
    }
}

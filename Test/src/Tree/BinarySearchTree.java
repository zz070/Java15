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

    //插入

    /*
    思路：
            1、若为空树，直接插入
            2、若不是空树：
               （ 1）按照查找顺序找到要插入的位置；
               （2）插入
     */

    public boolean insert(int key){
        if(root == null){
            root = new Node(key);
            return true;
        }
        Node cur = root;
        Node parent = null;   //cur的双亲节点
        while(cur != null){
            if(key < cur.key){
                parent = cur;
                cur = cur.left;
            }else if(key > cur.key){
                parent = cur;
                cur = cur.right;
            }else{
                //若要插入的元素，原来原来树中有，插入失败；
                return false;
            }
        }   // 该循环结束，说明已经找到要插入的位置，接下来根据key的大小，进行插入
        if(key < parent.key){
            parent.left = new Node(key);
        }else {
            parent.right = new Node(key);
        }
        return true;
    }

    //删除

    /*
    思路：
            1、先查找要删除的元素key，是否在树中；
            2、一共可分为三种情况：
                （1）树的左子树为空
                            a.若要删除结点是根节点(root = cur.right)
                            b.若要删除结点是父节点的左子树(parent.left = cur.right)
                            c.若要删除结点是父节点的右子树(parent.right = cur.right)
                （2）树的右子树为空
                            a.若要删除结点是根节点(root = cur.left)
                            b.若要删除结点是父节点的左子树(parent.left = cur.left)
                            c.若要删除结点是父节点的右子树(parent.right = cur.left)
                （3）树的左右子树都不为空
                            找到待删除节点右子树的最小值，将其与带删除元素交换，最后删除该节点即可
     */

    public boolean remove(int key){
        Node cur = root;
        Node parent = null;
        while(cur != null){
            if(key < cur.key){
                parent = cur;
                cur = cur.left;
            }else if(key > cur.key){
                parent = cur;
                cur = cur.right;
            }else{
                //此时已经找到要删除的元素，在该方法中进行删除
                removeNode(parent,cur);
                return true;
            }
        }
        //此时未找到要删除元素，删除失败
        return false;
    }
    private void removeNode(Node parent, Node cur) {
        //1、若要删除结点的左子树为空
        if(cur.left == null){
            //（1）若要删除结点是根节点
            if(cur == root){
                root = cur.right;
                //（2）若要删除结点是父节点的左子树
            }else if(cur == parent.left){
                parent.left = cur.right;
                //（3）若要删除结点是父节点的右子树
            }else{
                parent.right = cur.right;
            }
            //2、若要删除结点的右子树为空
        }else if(cur.right == null){
            //（1）若要删除结点是根节点
            if(cur == root){
                root = cur.left;
                //(2)若要删除结点是父节点的左子树
            }else if(cur == parent.left){
                parent.left = cur.left;
                //(3)若要删除结点是父节点的右子树
            }else{
                parent.right = cur.left;
            }
            //3、若有删除结点的左右子树都不为空
        }else{
            //(1)先找到走姿树中的最小元素（替罪羊）
            Node goatParent = cur;  // 替罪羊节点的父节点
            Node scapeGoat = cur.right;  // 替罪羊节点
            while(scapeGoat.left != null){
                goatParent =scapeGoat;
                scapeGoat = scapeGoat.left;
            }// 循环结束时, scapeGoat 指向了右子树中的最小值
            // (2) 把刚才找到的替罪羊的值赋给待删除节点
            cur.key = scapeGoat.key;
            // (3) 删除替罪羊节点
            // 替罪羊节点一定没有左子树
            if(scapeGoat == goatParent.left){
                goatParent.left = scapeGoat.right;
            }else{
                goatParent.right = scapeGoat.right;
            }
        }
    }

    public void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.key + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.key + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(3);
        tree.insert(6);
        tree.insert(8);

        // 为了查看到树的结构, 打印出树先序和中序遍历结果
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();

        System.out.println("=================");
        tree.remove(5);
        tree.preOrder(tree.root);
        System.out.println();
        tree.inOrder(tree.root);
        System.out.println();
    }
}

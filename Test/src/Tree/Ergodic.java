package Tree;

import java.util.Stack;

public class Ergodic {

    //构建一棵二叉树
    public static TreeNode build() {
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }


    /*
    非递归先序遍历二叉树
            先序遍历的次序是：跟左右；
            借助栈，先将root入栈，在栈不为空的情况下，
            （1）出栈，访问root结点，
            （2）再分别将他的右子树和左子树入栈，
            直至循环结束，先序遍历成功
     */
    public static void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> tree = new Stack<>();
        tree.push(root);
        while(!tree.isEmpty()){
            TreeNode top = tree.pop();
            System.out.println(top.val + "  ");
            if(top.right != null){
                tree.push(top.right);
            }
            if(top.left != null){
                tree.push(top.left);
            }
        }
    }
    /*
    非递归中序非递归遍历二叉树
            中序遍历的次序是：左跟右
     */
    public static void main(String[] args) {
        TreeNode root = build();
        System.out.print("先序遍历二叉树:");
        preOrder(root);
    }
}

package Tree;

import java.util.Stack;

public class PrintTree {
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
    //先序非递归遍历
    public static void preOrder(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode top = s.pop();
            System.out.print(top.val+" ");
            if(top.right!=null){
                s.push(top.right);
            }
            if(top.left!= null){
                s.push(top.left);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = build();
        System.out.print("先序遍历二叉树:");
        preOrder(root);// ABDEGCF
//        System.out.println();
//        System.out.print("中序遍历二叉树:");
//        inOrder(root);//DBGEACF
//        System.out.println();
//        System.out.print("后序遍历二叉树:");
//        postOrder(root);//DGEBFCA
    }
}
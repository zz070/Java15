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
        if(root == null){
            return;
        }
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
    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> s = new Stack<>();
        while(true){
            while(root!=null){
                s.push(root);
                root = root.left;
            }
            if(s.isEmpty()){
                break;
            }
           TreeNode top =  s.pop();
            System.out.print(top.val+" ");
            root = top.right;
        }
    }
    public static void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> s = new Stack<>();
        TreeNode pre = null;
        TreeNode cur = root;
        while(true){
            while(cur!=null){
                s.push(cur);
                cur = cur.left;
            }
            if(s.isEmpty()){
                break;
            }
            TreeNode top = s.peek();
            if(top.right == null||pre == top.right){
                System.out.print(top.val+" ");
                s.pop();
                pre = top;
            }else{
                cur = top.right;
            }
        }
    }

        public static void main(String[] args) {
        TreeNode root = build();
        System.out.print("先序遍历二叉树:");
        preOrder(root);// ABDEGCF
        System.out.println();
        System.out.print("中序遍历二叉树:");
        inOrder(root);//DBGEACF
        System.out.println();
        System.out.print("后序遍历二叉树:");
        postOrder(root);//DGEBFCA
    }
}
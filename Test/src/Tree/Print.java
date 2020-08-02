package Tree;


public class Print {
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
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
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
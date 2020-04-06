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
            先序遍历的次序是：根左右；
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
            System.out.print(top.val + "  ");
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
            中序遍历的次序是：左根右
            借助栈实现
            （1）从root出发，向左找，遇到的所有元素全部入栈，直到null为止；
            （2）找到最左后，出栈并访问这个元素；
            （3）将刚才元素的右子树作为起点继续向左找；
            （4）回到（2），直到栈为空
     */
    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> tree = new Stack<>();
        TreeNode cur = root;
        while(true){
            while(cur != null){
                tree.push(cur);
                cur = cur.left;
            }
            if(tree.isEmpty()){
                break;
            }
           TreeNode  top = tree.pop();
            System.out.print(top.val+"  ");
            cur = top.right;
        }
    }
    /*
    非递归后序遍历二叉树
            后序遍历的次序是：左右根
            非递归后序遍历与中序遍历类似，不同的是，后序遍历要考虑到，
            （1）栈顶元素的右子树为空
            （2）栈顶元素的右子树访问过了
     */
    public static void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> tree = new Stack<>();
        TreeNode cur = root;
        TreeNode pre = null;
        while(true){
            while(cur != null){
                tree.push(cur);
                cur = cur.left;
            }
            if(tree.isEmpty()){
                break;
            }
            TreeNode top = tree.peek();
            if(top.right == null || pre == top.right){
                System.out.print(top.val + "  ");
                tree.pop();
                pre = top;
            }else{
                cur = top.right;
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = build();
        System.out.print("先序遍历二叉树:");
        preOrder(root);
        System.out.println();
        System.out.print("中序遍历二叉树:");
        inOrder(root);
        System.out.println();
        System.out.print("后序遍历二叉树:");
        postOrder(root);
    }
}

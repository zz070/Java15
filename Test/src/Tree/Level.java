package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Level {
    //层序遍历
    public  static void levelOrder(TreeNode root){
        //借助一个队列完成层序遍历
        Queue<TreeNode> tree = new LinkedList<>();
        tree.offer(root);
        while(!tree.isEmpty()){
            //访问元素
            TreeNode cur = tree.poll();
            System.out.print(cur.val+"  ");
            //左右子树不为空时，将左右子树入列
            if(cur.left != null){
                tree.offer(cur.left);
            }
            if(cur.right != null){
                tree.offer(cur.right);
            }
        }
    }
}

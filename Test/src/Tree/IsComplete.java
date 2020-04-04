package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class IsComplete {
    //判断一棵树是否是完全二叉树
    public boolean isCompleteTree(TreeNode root) {
        /*解题思路
        该问题可以分为两个阶段；
        1、任意结点有两个子树；  2、任意节点没有子树
        针对二叉树进行层序遍历，对当前节点进行访问，在第一阶段，分为四种情况：
        (1)root的左右子树都不为空，那么直接入队列
        (2)root的左子树不为空，右子树为空，切换到状态二
        (3)root的左子树为空，右子树不为空，那么该二叉树一定不是完全二叉树，直接返回false
        (4)root的左右子树都为空，进入状态二
        进入第二阶段的所有结点一定没有子树，若右子树出现，一定的是完全二叉树
         */
        //若一棵二叉树为空，是一棵完全二叉树
        if(root == null){
            return true;
        }
        boolean nextstep = false;
        Queue<TreeNode> tree = new LinkedList<>();
        tree.offer(root);
        while(!tree.isEmpty()){
            TreeNode cur = tree.poll();
            //第一阶段，任意结点有两个子树；
            if(!nextstep){
                if(cur.left != null && cur.right != null){
                    tree.offer(cur.left);
                    tree.offer(cur.right);
                }else if(cur.left != null && cur.right == null){
                    nextstep = true;
                    tree.offer(cur.left);
                }else if(cur.left == null && cur.right != null){
                    return false;
                }else{
                    nextstep = true;
                }
            }else{
                //第二阶段，任意节点没有子树
                if(cur.left != null || cur.right != null){
                    return false;
                }
            }
        }
        return true;
    }
}

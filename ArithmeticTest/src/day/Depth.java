package day;

import Node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Depth {
    //方法一：递归法一
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }

    //方法二：递归法二
    int max = 0;
    public int TreeDepth2(TreeNode root) {
        if(root == null){
            return 0;
        }
        int depth = 0;
        helper(root,depth);
        return max;
    }

    private void helper(TreeNode root, int depth) {
        if(root == null){
            if(max<depth){
                max = depth;
            }
            return;
        }
        helper(root.left,depth+1);
        helper(root.right,depth+1);
    }

    //方法三：层序遍历法
    public int TreeDepth3(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int depth = 0;
        while(!q.isEmpty()) {
            depth++;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if (cur.left != null) {
                    q.offer(cur.left);
                }
                if (cur.right != null) {
                    q.offer(cur.right);
                }
            }
        }
        return depth;
    }
}

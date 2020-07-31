package day;

import Node.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTree {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode newroot = queue.poll();
            list.add(newroot.val);
            if(newroot.left!=null){
                queue.offer(newroot.left);
            }
            if(newroot.right!=null){
                queue.offer(newroot.right);
            }
        }
        return list;
    }
}

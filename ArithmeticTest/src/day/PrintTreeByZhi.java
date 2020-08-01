package day;

import Node.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintTreeByZhi {
    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> s = new Stack<>();
        Queue<TreeNode> q = new LinkedList<>();
        s.push(root);
        boolean flag = true;
        ArrayList<Integer> array = new ArrayList<>();
        TreeNode one = null;
        TreeNode two = null;
        while(!s.isEmpty()){
            int size = s.size();
            for(int i = 0;i<size;i++){
                TreeNode cur = s.pop();
                array.add(cur.val);
                if(flag){
                    one = cur.left;
                    two = cur.right;
                }else{
                    one = cur.right;
                    two = cur.left;
                }
                if(one != null){
                    q.offer(one);
                }
                if(two !=null){
                    q.offer(two);
                }
            }
            list.add(new ArrayList<>(array));
            array.clear();
            while(!q.isEmpty()){
                s.push(q.poll());
            }
            flag = !flag;
        }
        return list;
    }
}

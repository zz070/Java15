package day;

import Node.TreeNode;

import java.util.Stack;

public class KTreeNode {
    public static TreeNode KthNode(TreeNode root, int k){
        //搜索二叉树中序遍历是升序排序的
        //第k个元素，即中序遍历的第k位
        if(root == null || k<=0){
            return null;
        }
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;
        while(node!=null || !s.isEmpty()){
            while(node!=null){
                s.push(node);
                node = node.left;
            }
            if(!s.isEmpty()){
                node = s.pop();
                k--;
                if(k == 0){
                    return node;
                }
                node = node.right;
            }
        }
        return null;
    }
}

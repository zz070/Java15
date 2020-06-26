package Test24;

import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        int n1 = level(root.left);
        int n2 = level(root.right);
        if(n1-n2<-1||n1-n2>1){
            return false;
        }
        return isBalance(root.left)&&isBalance(root.right);
    }
    private int level(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int lenthLeft = level(root.left);
        int lenthRight= level(root.right);
        return 1+(lenthLeft>lenthRight?lenthLeft:lenthRight);
    }
}
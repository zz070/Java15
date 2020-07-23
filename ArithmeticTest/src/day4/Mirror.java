package day4;

import Node.TreeNode;

//操作给定的二叉树，将其变换为源二叉树的镜像。

public class Mirror {
    private static void mirrorTest(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirrorTest(root.left);
        mirrorTest(root.right);
    }
}

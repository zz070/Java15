package day4;

import Node.TreeNode;

public class SubTree {
    /*
    ①根据题意可知，若两棵二叉树中任意一棵树为空，直接返回false；
	②此时说明二叉树A,B都非空，从根结点开始比较，若相同，进入isSameTree()比较剩下部分是否相同，若不同，接着从A树的左右结点分别开始比较
	③在isSameTree()函数中，A的起始结点，B的根节点开始比较；
		A先为null说明B不是A的子结构，返回false；
		B先为null，说明比较完了，返回true
		若在树中有不同的结点，直接返回false；
		递归的对A,B树进行判断
     */
    public boolean HasSubtree(TreeNode A, TreeNode B) {
        if(A == null || B == null){
            return false;
        }
        boolean result = false;
        if(A.val == B.val){
            result = isSameTree(A,B);
        }
        if(result ==false){
            result = isSameTree(A.left,B);
        }
        if(result == false){
            result = isSameTree(A.right,B);
        }
        return result;
    }

    private boolean isSameTree(TreeNode A, TreeNode B) {
        if(B == null){
            return true;
        }
        if(A == null){
            return false;
        }
        if(A.val != B.val){
            return false;
        }
        return isSameTree(A.left,B.left)&&isSameTree(A.right,B.right);
    }
}

package Tree;

import java.util.Scanner;

public class BuildTree {
    /*
    题目描述
            编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。
            例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。
            建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
    输入描述:
            输入包括1行字符串，长度不超过100。
    输出描述:
            可能有多组测试数据，对于每组数据，
            输出将输入字符串建立二叉树后中序遍历的序列，每个字符后面都有一个空格。
            每个输出结果占一行。

     思路：
               1、构建正确的输入输出框架，注意输入输出格式（在牛客网中没有输入输出框架）
               2、先序遍历构建二叉树；
               3、中序遍历输出；
     */
    static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.next();
            Node root = build(line);
            inOrder(root);
            System.out.println();   //每输出占一行
        }
    }
    private static int index = 0;
    private static Node build(String line) {
        char c = line.charAt(index);
        if(c == '#'){
            return null;
        }
        Node root = new Node(c);
        index++;
        root.left = build(line);
        index++;
        root.right = build(line);
        return root;
    }

    //中序遍历
    private static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");  //注意输出格式，每个字符后都有一个空格
        inOrder(root.right);
    }
}

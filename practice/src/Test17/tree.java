package Test17;

     class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
         this.val = val;
     }
    public class tree {
        public void Mirror(TreeNode root) {
            if(root == null){
                return;
            }
            TreeNode t = root.left;
            root.left = root.right;
            root.right = t;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}

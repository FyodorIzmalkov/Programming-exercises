package leetcode.unsorted;


public class rangeSumBST {
     private static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public int rangeSumBST(TreeNode root, int L, int R) {
        int sum = 0;
        if (root == null)
            return 0;
        if (root.val >= L && root.val <= R)
            sum += root.val;
        sum += rangeSumBST(root.left, L, R);
        sum += rangeSumBST(root.right, L, R);
        return sum;
    }
}

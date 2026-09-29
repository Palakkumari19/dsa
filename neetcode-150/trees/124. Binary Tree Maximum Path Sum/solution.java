/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxSum;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        solve(root);
        return maxSum;
    }
    public int solve(TreeNode root){
        if(root == null)    return 0;
        int l = solve(root.left);
        int r = solve(root.right);
        int niche_ans = l + r + root.val;
        int only_onr_good = Math.max(l,r) + root.val;
        int only_root_good = root.val;
        maxSum = Math.max(maxSum,Math.max(niche_ans, Math.max(only_onr_good,only_root_good)));
        return Math.max(only_onr_good,only_root_good);
    }
}
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        return dfs(root,0, targetSum);
    }
    public boolean dfs(TreeNode root,int sum, int targetSum){
        if(root==null)  return false;
        sum += root.val;
        if(root.left == null && root.right == null) 
            return sum==targetSum;
        return dfs(root.left,sum,targetSum ) ||  dfs(root.right,sum, targetSum);
    }
}
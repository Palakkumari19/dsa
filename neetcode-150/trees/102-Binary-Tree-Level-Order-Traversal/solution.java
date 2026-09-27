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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        List<List<Integer>> level = new LinkedList<>();
        if(root == null)
            return level;
        nodes.offer(root);
        while(!nodes.isEmpty()){
            int lvlNum = nodes.size();
            List<Integer> curr = new LinkedList<>();
            for(int i=0;i<lvlNum;i++){
                if(nodes.peek().left != null)
                    nodes.offer(nodes.peek().left);
                if(nodes.peek().right != null)
                    nodes.offer(nodes.peek().right);
                curr.add(nodes.poll().val);
            }
            level.add(curr);
        }
        return level;
    }
}
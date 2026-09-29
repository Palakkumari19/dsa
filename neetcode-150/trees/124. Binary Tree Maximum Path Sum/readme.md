# 124. Binary Tree Maximum Path Sum

## Approach

Use DFS recursion to calculate the maximum path sum that can be extended upward from each node.

For every node, calculate the maximum contribution from its left and right subtrees. A path passing through the current node can include both sides:

`left + root + right`

Update the global maximum with this value.

For returning to the parent, only one side can be chosen because a path going upward cannot split into both subtrees. Therefore, return:

`max(left, right) + root.val`

Negative subtree contributions are naturally ignored by taking the maximum with the available paths.

## Complexity

**Time:** O(n)

Each node is visited exactly once, and only constant-time calculations are performed at each node. Therefore, for `n` nodes, the total time complexity is **O(n)**.

**Space:** O(h) due to the recursion stack, where h is the height of the tree.
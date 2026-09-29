# 1448. Count Good Nodes in Binary Tree

## Approach

Use DFS recursion while keeping track of the maximum value seen from the root to the current node.

If the current node's value is greater than or equal to the maximum value, count it as a good node.

Update the maximum value and recursively check the left and right subtrees.

Return the total count from both subtrees along with the current node.

## Complexity

**Time:** O(n)

**Space:** O(h) due to the recursion stack, where h is the height of the tree.
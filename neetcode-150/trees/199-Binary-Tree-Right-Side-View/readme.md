# 199. Binary Tree Right Side View

## Approach

Use DFS traversal while keeping track of the current depth.

Traverse the right subtree before the left subtree so that the first node visited at each depth is the rightmost node visible from the right side.

If the current depth is equal to the size of the result list, add the current node's value to the result.

Continue recursively for the right and left subtrees.

## Complexity

**Time:** O(n), where n is the number of nodes in the tree.

**Space:** O(h) due to the recursion stack, where h is the height of the tree.
# 98. Validate Binary Search Tree

## Approach

Use DFS recursion while maintaining a valid range `(minVal, maxVal)` for each node.

For every node, check whether its value lies strictly within the allowed range. If it violates the range, the tree is not a valid BST.

For the left subtree, update the maximum value to the current node's value. For the right subtree, update the minimum value to the current node's value.

Return `true` only if both subtrees are valid BSTs.

## Complexity

**Time:** O(n)

**Space:** O(h) due to the recursion stack, where h is the height of the tree.
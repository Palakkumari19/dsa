# 144. Binary Tree Preorder Traversal

## Approach

Use recursion to perform a preorder traversal of the binary tree.

First, visit and add the current node's value to the result.

Then recursively traverse the left subtree followed by the right subtree.

If the current node is `null`, return.

## Complexity

**Time:** O(n), where n is the number of nodes in the tree.

**Space:** O(h) due to the recursion stack, where h is the height of the tree.
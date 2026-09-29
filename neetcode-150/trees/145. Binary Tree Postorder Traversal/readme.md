# 145. Binary Tree Postorder Traversal

## Approach

Use recursion to perform a postorder traversal of the binary tree.

First, recursively traverse the left subtree.

Then recursively traverse the right subtree.

Finally, visit and add the current node's value to the result.

If the current node is `null`, return.

## Complexity

**Time:** O(n), where n is the number of nodes in the tree.

**Space:** O(h) due to the recursion stack, where h is the height of the tree.
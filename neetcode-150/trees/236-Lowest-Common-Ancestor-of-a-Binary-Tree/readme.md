# 236. Lowest Common Ancestor of a Binary Tree

## Approach

Use recursion to search for `p` and `q` in the binary tree.

If the current node is `null`, return `null`.

If the current node is either `p` or `q`, return the current node.

Recursively search the left and right subtrees.

If both left and right searches return a node, then `p` and `q` are present in different subtrees, so the current node is their lowest common ancestor.

If only one side returns a node, return that node.

## Complexity

**Time:** O(n), where n is the number of nodes in the tree.

**Space:** O(h) due to the recursion stack, where h is the height of the tree.
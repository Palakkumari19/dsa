# 235. Lowest Common Ancestor of a Binary Search Tree

## Approach

Use the properties of a Binary Search Tree to find the lowest common ancestor.

If both `p` and `q` are greater than the current node, move to the right subtree.

If both `p` and `q` are smaller than the current node, move to the left subtree.

Otherwise, the current node is the lowest common ancestor because `p` and `q` lie on different sides of the current node, or the current node itself is one of them.

## Complexity

**Time:** O(h), where h is the height of the BST.

**Space:** O(1) because the solution uses an iterative approach.
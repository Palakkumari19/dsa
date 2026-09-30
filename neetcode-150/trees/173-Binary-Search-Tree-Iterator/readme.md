# 173. Binary Search Tree Iterator

## Approach

Use a stack to simulate the in-order traversal of the BST.

Push the entire left path of the tree into the stack initially.

For `next()`, pop the top node, then push the left path of its right subtree.

`hasNext()` simply checks whether the stack is empty.

## Complexity

**Time:** O(1) average for `next()` and O(1) for `hasNext()`.

**Space:** O(h), where h is the height of the tree.
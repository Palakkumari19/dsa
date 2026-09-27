# 572. Subtree of Another Tree

## Approach

Use recursion to search for `subRoot` inside `root`.

At each node, check if the subtree starting from that node is identical to `subRoot` using `isSame()`.

If they are not identical, recursively check the left subtree and the right subtree.

In `isSame()`, compare the values of the current nodes and recursively check whether their left and right subtrees are also identical.

Return true if a matching subtree is found, otherwise return false.

## Complexity

**Time:** O(n × m), where n is the number of nodes in `root` and m is the number of nodes in `subRoot`.

**Space:** O(h) due to the recursion stack, where h is the height of the tree.
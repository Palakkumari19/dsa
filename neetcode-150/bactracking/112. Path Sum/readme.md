# 112. Path Sum

## Approach

Use DFS recursion to traverse every root-to-leaf path while keeping track of the current path sum.

Add the current node's value to `sum` at each step.

When a leaf node is reached, check whether the accumulated sum is equal to `targetSum`.

Recursively check both the left and right subtrees and return `true` if either subtree contains a valid path.

## Complexity

**Time:** O(n)

Each node is visited at most once, so the total time complexity is **O(n)**.

**Space:** O(h) due to the recursion stack, where h is the height of the tree.
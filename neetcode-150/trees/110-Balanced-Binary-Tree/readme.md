**# 110. Balanced Binary Tree**

**## Approach**

- Recursively calculate the height of the left and right subtrees for every node.
- If the difference between the two subtree heights is greater than `1`, the tree is not balanced.
- Check the same condition recursively for both the left and right subtrees.
- The `height()` function returns `0` for a `null` node and `1 + max(leftHeight, rightHeight)` otherwise.
- The tree is height-balanced if every node has a height difference of at most `1`.

**## Complexity**

- **\*\*Time:\*\*** O(n²) because the height of subtrees is recalculated for each node.
- **\*\*Space:\*\*** O(h) due to the recursion stack, where `h` is the height of the tree.
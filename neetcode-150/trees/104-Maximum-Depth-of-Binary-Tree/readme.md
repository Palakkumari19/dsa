**# 104. Maximum Depth of Binary Tree**

**## Approach**

- Use **recursion** to calculate the depth of the binary tree.
- If the current node is `null`, return `0`.
- Recursively calculate the maximum depth of the left and right subtrees.
- Take the larger of the two depths and add `1` for the current node.
- Return the maximum depth of the tree.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(h) due to the recursion stack, where `h` is the height of the tree.
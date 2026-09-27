**# 543. Diameter of Binary Tree**

**## Approach**

- Use **recursion** to calculate the height of each subtree.
- For every node, calculate the height of its left and right subtrees.
- The longest path passing through the current node is `leftHeight + rightHeight`.
- Keep track of the maximum diameter found using the `dia` array.
- Return `1 + max(leftHeight, rightHeight)` as the height of the current subtree.
- Since the diameter is measured in **edges**, the result is `leftHeight + rightHeight`.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(h) due to the recursion stack, where `h` is the height of the tree.
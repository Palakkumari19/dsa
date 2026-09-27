**# 100. Same Tree**

**## Approach**

- Use **recursion** to compare the two binary trees.
- If both nodes are `null`, they are identical at that position.
- If one node is `null` and the other is not, the trees are different.
- Compare the values of the current nodes.
- Recursively check whether their left subtrees and right subtrees are also identical.
- Return `true` only if the values and structures match at every corresponding node.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(h) due to the recursion stack, where `h` is the height of the tree.
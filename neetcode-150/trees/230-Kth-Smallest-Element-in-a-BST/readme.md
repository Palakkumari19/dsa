**# 230. Kth Smallest Element in a BST**

**## Approach**

- Perform an **inorder traversal** of the BST.
- Inorder traversal visits BST nodes in **ascending order**.
- Store each visited node's value in an `ArrayList`.
- The `k`th smallest element is at index `k - 1` in the list.
- Return `list.get(k - 1)` as the answer.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(n) for the list and recursion stack.
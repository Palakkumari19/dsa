**# 450. Delete Node in a Binary Search Tree**

**## Approach**

- Traverse the BST to find the node containing the given `key`.
- If the node is found, handle the deletion based on its children:
  - If it has no left child, return its right child.
  - If it has no right child, return its left child.
  - If it has both children, find the rightmost node of the left subtree.
- Attach the original node's right subtree to this rightmost node.
- Return the left subtree as the replacement for the deleted node.
- Use the `dummy` reference to preserve the original root while traversing the tree.

**## Complexity**

- **\*\*Time:\*\*** O(h), where `h` is the height of the BST.
- **\*\*Space:\*\*** O(h) due to the recursive `findLastChild()` call.
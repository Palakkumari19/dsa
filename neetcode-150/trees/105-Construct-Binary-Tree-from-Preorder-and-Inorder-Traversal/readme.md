**# 105. Construct Binary Tree from Preorder and Inorder Traversal**

**## Approach**

- Use a **HashMap** to store the index of each value in the inorder traversal for O(1) lookup.
- The first element of the preorder range is always the **root** of the current subtree.
- Find the root's position in the inorder array using the HashMap.
- Calculate the number of nodes in the left subtree using the inorder position.
- Recursively construct the **left subtree** using the corresponding preorder and inorder ranges.
- Recursively construct the **right subtree** using the remaining ranges.
- Continue until the traversal ranges become empty.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(n) for the HashMap and recursion stack.
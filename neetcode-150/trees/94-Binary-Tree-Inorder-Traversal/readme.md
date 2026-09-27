**# 94. Binary Tree Inorder Traversal**

**## Approach**

- Use **recursion** to perform an inorder traversal of the binary tree.
- First recursively traverse the **left subtree**.
- Add the current node's value to the result list.
- Then recursively traverse the **right subtree**.
- If the current node is `null`, return without doing anything.
- The traversal order is **Left → Root → Right**.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(n) due to the recursion call stack and result list.
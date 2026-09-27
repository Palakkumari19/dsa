**# 226. Invert Binary Tree**

**## Approach**

- Use a **Queue** to traverse the binary tree level by level using BFS.
- For each node, swap its left and right children.
- Add the swapped children to the queue if they are not `null`.
- Continue until all nodes have been processed.
- Return the original root, which now represents the inverted tree.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(n) in the worst case for the queue.
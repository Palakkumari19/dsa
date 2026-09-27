**# 102. Binary Tree Level Order Traversal**

**## Approach**

- Use a **Queue** to perform **Breadth-First Search (BFS)**.
- Add the root node to the queue and process the tree level by level.
- For each level, store the current queue size to determine how many nodes belong to that level.
- Remove each node from the queue, add its value to the current level, and add its non-null left and right children to the queue.
- Add the completed level to the result list and continue until the queue is empty.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(n)
# 297. Serialize and Deserialize Binary Tree

## Approach

Use **BFS (level-order traversal)** to serialize the binary tree.

For serialization, store each node's value in a string and use `"n"` to represent `null` nodes. A queue is used to process the tree level by level.

For deserialization, split the string into values and reconstruct the tree using a queue. Each parent node receives the next two values as its left and right children. `"n"` values are skipped.

This preserves both the structure and values of the original tree.

## Complexity

**Time:** O(n)

Each node is processed once during serialization and once during deserialization. Therefore, the total time complexity is **O(n)**.

**Space:** O(n)

The queue and serialized string can contain information proportional to the number of nodes, so the space complexity is **O(n)**.
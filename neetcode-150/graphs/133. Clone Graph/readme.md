# Clone Graph

## Approach

Depth-First Search (DFS) is used to create a deep copy of the given graph.

A HashMap is maintained to map each original node to its corresponding cloned node. This ensures that every node is cloned only once and helps preserve the graph's connections, including cycles.

First, the starting node is cloned and stored in the HashMap. DFS then traverses its neighbors. For each neighbor:
- If it has not been cloned, a new node is created, stored in the HashMap, added to the cloned node's neighbor list, and DFS is called recursively.
- If it has already been cloned, its existing clone is added to the current cloned node's neighbor list.

Finally, the cloned starting node is returned.

## Complexity

**Time:** O(V + E) — Every vertex is cloned once, and every edge is traversed once.

**Space:** O(V) — The HashMap stores one cloned node per original vertex, and the recursive DFS stack can take up to O(V) space.
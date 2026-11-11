# Is Graph Bipartite?

## Approach

Breadth-First Search (BFS) is used to check whether the graph can be divided into two sets such that no two adjacent vertices belong to the same set.

A `set` array is maintained to store the group assigned to each vertex. Initially, all vertices are assigned `-1`, indicating that they are unvisited.

Since the graph may be disconnected, every unvisited vertex is considered as a starting point for BFS and assigned to set `0`.

For each adjacent node:
- If it is unvisited, it is assigned to the opposite set using `1 - set[node]` and added to the queue.
- If it is already assigned to the same set as the current node, the graph is not bipartite, so `false` is returned.

If all connected components are processed without conflicts, the graph is bipartite and `true` is returned.

## Complexity

**Time:** O(V + E) — Every vertex is visited once, and every edge is examined at most twice through the adjacency list.

**Space:** O(V) — The `set` array and BFS queue require O(V) space.
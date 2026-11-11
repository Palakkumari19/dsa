# Shortest Path in Binary Matrix

## Approach

Breadth-First Search (BFS) is used to find the shortest path from the top-left cell `(0,0)` to the bottom-right cell `(n-1,n-1)`.

Since movement is allowed in all 8 directions (horizontal, vertical, and diagonal), a direction array is used to explore all possible neighboring cells.

A queue stores the current row, column, and path length. Initially, `(0,0)` is inserted with a path length of `1`.

For every cell removed from the queue, all 8 neighboring cells are checked. If a neighboring cell is within bounds and contains `0` (unvisited and traversable), it is marked as visited by changing its value to `1` and added to the queue with an incremented path length.

When the destination cell is reached, its path length is returned. If the queue becomes empty without reaching the destination, `-1` is returned.

## Complexity

**Time:** O(n²) — In the worst case, every cell is visited once. Each cell checks 8 possible directions, which takes constant time.

**Space:** O(n²) — The queue can store up to O(n²) cells in the worst case.
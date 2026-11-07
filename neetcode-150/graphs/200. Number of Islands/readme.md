# Number of Islands

## Approach

Depth-First Search (DFS) is used to count the number of connected groups of land cells (`'1'`) in the grid.

A `visited` matrix is maintained to keep track of already explored cells. The grid is traversed row by row. Whenever an unvisited land cell is found, the island count is incremented, and DFS is started from that cell.

DFS marks the current cell as visited and explores all four adjacent directions: up, down, left, and right. It stops when it reaches a boundary, an already visited cell, or a water cell (`'0'`).

This ensures that all connected land cells belonging to the same island are visited together and counted only once.

## Complexity

**Time:** O(m × n) — Every cell is visited at most once, and each DFS call performs constant work apart from its four recursive calls.

**Space:** O(m × n) — The visited matrix requires O(m × n) space, and the recursive DFS stack can also take up to O(m × n) space in the worst case.
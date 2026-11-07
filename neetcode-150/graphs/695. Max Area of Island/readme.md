# Max Area of Island

## Approach

Depth-First Search (DFS) is used to find the area of each connected island in the grid.

A `visited` matrix keeps track of explored cells. The grid is traversed row by row. Whenever an unvisited land cell (`1`) is found, DFS is called to calculate the area of that island.

DFS marks the current cell as visited, initializes its area to `1`, and recursively explores all four directions: up, down, left, and right. The areas returned by these recursive calls are added to calculate the total island area.

After exploring an island, its area is compared with `maxArea` to keep track of the largest island.

## Complexity

**Time:** O(m × n) — Every cell is visited at most once, and each DFS call checks four directions, taking constant work per cell.

**Space:** O(m × n) — The visited matrix requires O(m × n) space, and the recursive DFS stack can also take up to O(m × n) space in the worst case.
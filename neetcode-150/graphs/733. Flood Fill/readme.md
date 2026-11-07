# Flood Fill

## Approach

Depth-First Search (DFS) is used to fill all connected pixels having the same original color as the starting pixel.

First, the original color is stored. If the original color is already equal to the new color, the image is returned without any changes.

Otherwise, DFS is performed starting from `(sr, sc)`. Each valid pixel with the original color is changed to the new color, and DFS is recursively called in all four directions: up, down, left, and right.

The boundary conditions ensure that the traversal stays within the image and only visits pixels with the original color.

## Complexity

**Time:** O(m × n) — In the worst case, every pixel in the image is visited and updated once.

**Space:** O(m × n) — In the worst case, the recursive DFS call stack can contain up to `m × n` calls.
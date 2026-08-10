# 1510. Stone Game IV

## Approach
- Use DFS with memoization to determine whether the current player can force a win.
- For each state, try removing every possible square number of stones.
- If any move leaves the opponent in a losing state, the current player wins.
- Store computed results to avoid repeated calculations.

## Complexity
- **Time:** O(n√n)
- **Space:** O(n)
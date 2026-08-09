# 1140. Stone Game II

## Approach
- Use prefix sums to quickly calculate the stones remaining from any index.
- Apply DFS with memoization on the current index `i` and game parameter `M`.
- Try taking `X` piles for every `1 <= X <= 2M` and choose the maximum stones Alice can obtain.
- If the remaining piles can all be taken, return their total directly.

## Complexity
- **Time:** O(n³)
- **Space:** O(n²) — Memoization table and prefix sum array.
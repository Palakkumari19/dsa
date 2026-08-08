# 167. Two Sum II - Input Array Is Sorted

## Approach
- Traverse the array while storing each number and its index in a `HashMap`.
- For every element, calculate its complement (`target - current`).
- If the complement exists in the map, return the corresponding 1-based indices.
- Otherwise, store the current element and continue.

## Complexity
- **Time:** O(n) — Single traversal with O(1) average-time `HashMap` operations.
- **Space:** O(n) — The `HashMap` stores up to `n` elements.
# 1. Two Sum

## Approach

- Traverse the array while storing each number and its index in a `HashMap`.
- For every element, calculate its complement (`target - current`).
- If the complement already exists in the map, return the two indices.
- Otherwise, store the current element and continue.

## Complexity

- **Time:** O(n)
- **Space:** O(n)
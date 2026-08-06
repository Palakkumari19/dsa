# 217. Contains Duplicate

## Approach

- Traverse the array while maintaining a `HashSet`.
- If the current element already exists in the set, return `true`.
- Otherwise, add it to the set.
- If no duplicates are found after the traversal, return `false`.

## Complexity

- **Time:** O(n)
- **Space:** O(n)
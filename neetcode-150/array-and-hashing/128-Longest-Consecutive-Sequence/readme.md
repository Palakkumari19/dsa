# 128. Longest Consecutive Sequence

## Approach
- Sort the array in ascending order.
- Traverse the sorted array and count the length of consecutive sequences.
- Skip duplicate elements while updating the maximum sequence length.
- Return the length of the longest consecutive sequence.

## Complexity
- **Time:** O(n log n) — Sorting the array dominates the runtime.
- **Space:** O(1) — Uses only a few extra variables.
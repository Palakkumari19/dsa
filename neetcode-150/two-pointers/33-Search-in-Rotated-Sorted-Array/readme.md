# 33. Search in Rotated Sorted Array

## Approach
- Use binary search to locate the target in the rotated sorted array.
- Determine which half of the current range is sorted.
- Check whether the target lies within the sorted half and eliminate the other half accordingly.
- Continue until the target is found or the search range becomes empty.

## Complexity
- **Time:** O(log n) — The search space is halved at each iteration.
- **Space:** O(1) — Uses only a few extra variables.
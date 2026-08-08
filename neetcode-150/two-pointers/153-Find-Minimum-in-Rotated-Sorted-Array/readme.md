# 153. Find Minimum in Rotated Sorted Array

## Approach
- Use binary search on the rotated sorted array.
- Compare the middle element with the right boundary to determine which half contains the minimum.
- Track the minimum value while narrowing the search range.

## Complexity
- **Time:** O(log n) — Binary search reduces the search space by half each iteration.
- **Space:** O(1) — Uses only a few extra variables.
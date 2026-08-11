# 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum

## Approach
- Find the longest sequential prefix and calculate its sum.
- Store all elements in a `HashSet`.
- Starting from the prefix sum, find the smallest missing integer.

## Complexity
- **Time:** O(n) average
- **Space:** O(n)
# 15. 3Sum

## Approach
- Sort the array to make it easier to find triplets and skip duplicates.
- Fix one element and use two pointers to find the remaining two elements.
- Move the pointers based on whether the current sum is less than or greater than zero.
- When a valid triplet is found, add it to the result and skip duplicate values.

## Complexity
- **Time:** O(n²) — Sorting takes O(n log n), followed by an O(n²) two-pointer traversal.
- **Space:** O(1) — Uses only constant extra space apart from the output list.
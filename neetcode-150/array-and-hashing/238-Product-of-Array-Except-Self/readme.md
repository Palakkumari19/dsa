# 238. Product of Array Except Self

## Approach
- Compute the prefix product for each index and store it in a `left` array.
- Compute the suffix product for each index and store it in a `right` array.
- Multiply the corresponding prefix and suffix products to get the final answer.

## Complexity
- **Time:** O(n) — Three linear traversals of the array.
- **Space:** O(n) — Extra `left`, `right`, and result arrays.
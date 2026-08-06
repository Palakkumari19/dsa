# 347. Top K Frequent Elements

## Approach

- Count the frequency of each element using a `HashMap`.
- Store each element as a pair `{frequency, value}` in a list.
- Sort the list in descending order of frequency.
- Return the first `k` elements from the sorted list.

## Complexity

- **Time:** O(n log n)
- **Space:** O(n)
# K Closest Points to Origin

## Approach

A Max Heap of size `k` is used to keep track of the `k` closest points to the origin. The distance of each point is calculated using the squared Euclidean distance: `x² + y²`.

The max heap keeps the farthest point at the root. Each point is inserted into the heap, and if its size exceeds `k`, the farthest point is removed.

This ensures that the heap always contains the `k` closest points. Finally, the remaining points are extracted into the result array.

## Complexity

**Time:** O(n log k) — Each of the `n` points is inserted into the heap, and if the heap size exceeds `k`, one element is removed. Both operations take O(log k) time.

**Space:** O(k) — The priority queue stores at most `k` points, and the result array also stores `k` points. Auxiliary space is O(k).
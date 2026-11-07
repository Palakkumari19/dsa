# Kth Largest Element in a Stream

## Approach

A Min Heap (PriorityQueue) of size `k` is used to keep track of the `k` largest elements seen so far. For every element, it is inserted into the heap. If the heap size exceeds `k`, the smallest element is removed.

This ensures that the heap always contains the `k` largest elements, with the smallest among them at the root. Therefore, `pq.peek()` gives the kth largest element.

The same process is followed whenever a new value is added to the stream.

## Complexity

**Time:**
- **Constructor:** O(n log k) — Each of the `n` elements is inserted into a heap of at most `k` elements, taking O(log k) per insertion.
- **add():** O(log k) — Insertion and removal each take O(log k).

**Space:** O(k) — The priority queue stores at most `k` elements.
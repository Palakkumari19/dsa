# Kth Largest Element in an Array

## Approach

A Min Heap (PriorityQueue) of size `k` is used to keep track of the `k` largest elements in the array.

Each element is inserted into the heap. If the heap size exceeds `k`, the smallest element is removed. This ensures that the heap always contains the `k` largest elements.

Since a Min Heap keeps the smallest element at the root, `pq.poll()` returns the kth largest element.

## Complexity

**Time:** O(n log k) — Each of the `n` elements is inserted into the heap, and elements are removed whenever the heap size exceeds `k`. Each heap operation takes O(log k) time.

**Space:** O(k) — The priority queue stores at most `k` elements.
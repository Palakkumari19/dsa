# Last Stone Weight

## Approach

A Max Heap (PriorityQueue) is used to always access the two heaviest stones efficiently. All stones are inserted into the heap.

While more than one stone remains, the two heaviest stones are extracted. If their weights are different, the difference (`y - x`) is inserted back into the heap. If they are equal, both stones are destroyed, so nothing is added.

The process continues until at most one stone remains. The remaining stone's weight is returned, or `0` if no stones are left.

## Complexity

**Time:** O(n log n) — Building the heap takes O(n log n) through individual insertions. In the worst case, up to `n - 1` iterations are performed, with each iteration involving two removals and at most one insertion, each taking O(log n).

**Space:** O(n) — The max heap can store up to `n` stones.
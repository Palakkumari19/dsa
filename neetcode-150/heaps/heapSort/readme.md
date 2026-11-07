# 912. Sort an Array

## Approach

Use **Heap Sort** to sort the array in ascending order.

First, build a **Max Heap** by calling `heapify()` from the last non-leaf node towards the root. This ensures that the largest element is at the root.

Then repeatedly swap the root (largest element) with the last element of the unsorted portion of the array.

Reduce the heap size and call `heapify()` again to restore the Max Heap property.

Continue until all elements are sorted.

## Complexity

**Time:** O(n log n)

Building the Max Heap takes O(n) time, and extracting the maximum element requires O(log n) heapification for each of the `n` elements. Therefore, the overall time complexity is **O(n log n)**.

**Space:** O(log n) due to the recursive `heapify()` call stack.
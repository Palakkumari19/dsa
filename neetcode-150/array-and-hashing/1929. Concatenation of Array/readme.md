# 1929. Concatenation of Array

## Approach

Create a new array of size `2 * n`, where `n` is the length of the input array.

Traverse the input array once. For every element, place it at its original position and again at the corresponding position after the first `n` elements.

This directly forms the concatenation of the array with itself.

## Complexity

**Time:** O(n)

Each element of the input array is processed exactly once, and constant-time assignments are performed for each element. Therefore, the total time complexity is **O(n)**.

**Space:** O(n)

A new array of size `2n` is created to store the result, so the extra space used is **O(n)**.
**# 287. Find the Duplicate Number**

**## Approach**

- Treat the array as a linked list where each value points to the index of the next element.
- Use **Floyd's Tortoise and Hare algorithm** with two pointers, `slow` and `fast`.
- Move `slow` one step at a time and `fast` two steps at a time until they meet inside the cycle.
- Reset `slow` to `0` while keeping `fast` at the meeting point.
- Move both pointers one step at a time until they meet again.
- The meeting point is the **duplicate number**.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(1)
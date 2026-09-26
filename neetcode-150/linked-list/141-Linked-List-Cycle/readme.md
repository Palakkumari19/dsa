**# 11. Linked List Cycle**

**## Approach**

* Use **Floyd's Cycle Detection Algorithm** with two pointers: `slow` and `fast`.
* Move `slow` one step at a time and `fast` two steps at a time.
* If there is a cycle, `slow` and `fast` will eventually meet.
* If `fast` reaches `null` or `fast.next` reaches `null`, the linked list does not contain a cycle.
* Return `true` when both pointers meet; otherwise, return `false`.

**## Complexity**

* ****Time:**** O(n)
* ****Space:**** O(1)

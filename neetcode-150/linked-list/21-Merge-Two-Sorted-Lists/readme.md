**# 10. Merge Two Sorted Lists**

**## Approach**

* Use two pointers to traverse both sorted linked lists.
* Create a dummy node to simplify building the merged list.
* Compare the current nodes of both lists and attach the smaller node to the merged list.
* Move the pointer of the list from which the node was selected.
* Once one list is exhausted, attach the remaining nodes of the other list.
* Return `dummy.next` as the head of the merged sorted list.

**## Complexity**

* ****Time:**** O(n + m)
* ****Space:**** O(1)

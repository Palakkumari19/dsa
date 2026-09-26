**# 9. Reverse Linked List**

**## Approach**

* Use recursion to reverse the linked list.
* Recursively reverse the list starting from `head.next`.
* Once the remaining list is reversed, make `head.next` point to `head`.
* Set `head.next` to `null` to break the original connection.
* Return the new head of the reversed list.

**## Complexity**

* ****Time:**** O(n)
* ****Space:**** O(n) due to the recursion call stack.


**# 19. Remove Nth Node From End of List**

**## Approach**

- Use two pointers, `left` and `right`, with a dummy node before the head.
- Move the `right` pointer `n` positions ahead to maintain a gap of `n` nodes.
- Move both pointers together until `right` reaches the end of the list.
- At this point, `left` is positioned just before the node that needs to be removed.
- Skip the target node using `left.next = left.next.next`.
- Return `dummy.next` as the new head.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(1)
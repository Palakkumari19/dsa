**# 701. Insert into a Binary Search Tree**

**## Approach**

- Start from the root and compare the given value with the current node's value.
- If `val` is greater than the current node, move to the **right** subtree.
- If `val` is smaller than the current node, move to the **left** subtree.
- Continue until an empty (`null`) position is found.
- Insert the new node at that position while maintaining the BST property.
- If the root is `null`, create and return a new node directly.

**## Complexity**

- **\*\*Time:\*\*** O(h), where `h` is the height of the BST.
- **\*\*Space:\*\*** O(1) for the iterative approach.
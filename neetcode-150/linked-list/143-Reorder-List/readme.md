**# 143. Reorder List**

**## Approach**

- Use the **slow and fast pointer** technique to find the middle of the linked list.
- Split the list into two halves.
- Reverse the second half using three pointers: `sec`, `prev`, and `temp`.
- Merge the first half and the reversed second half alternately.
- Store the next nodes in temporary variables before changing the links to avoid losing the remaining list.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(1)
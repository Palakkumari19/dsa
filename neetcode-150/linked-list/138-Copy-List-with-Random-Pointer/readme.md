**# 138. Copy List with Random Pointer**

**## Approach**

- Use a **HashMap** to maintain the mapping between each original node and its corresponding copied node.
- Traverse the original list once and create a new node for every original node, storing the mapping in the HashMap.
- Traverse the list again and set the `next` and `random` pointers of each copied node using the HashMap.
- Since every original node has a corresponding copied node in the map, the random pointers can be correctly connected without pointing to any original node.
- Return the copied node corresponding to the original `head`.

**## Complexity**

- **\*\*Time:\*\*** O(n)
- **\*\*Space:\*\*** O(n)
**# 2. Add Two Numbers**

**## Approach**

- Traverse both linked lists simultaneously, adding the corresponding digits along with the `carry`.
- Create a new node with `sum % 10` and update `carry` using `sum / 10`.
- Continue until both lists are completely traversed.
- If one list is shorter, treat its missing digits as `0`.
- After processing both lists, add a final node if a `carry` remains.
- Use a dummy node to simplify construction of the result list.

**## Complexity**

- **\*\*Time:\*\*** O(max(n, m))
- **\*\*Space:\*\*** O(max(n, m)) for the resulting linked list.
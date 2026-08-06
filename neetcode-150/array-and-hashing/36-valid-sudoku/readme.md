# 36. Valid Sudoku

## Approach
- Check each row for duplicate digits using a `HashSet`.
- Check each column for duplicate digits using a `HashSet`.
- Check each 3×3 sub-box for duplicate digits using a `HashSet`.
- If any duplicate is found, return `false`; otherwise, return `true`.

## Complexity
- **Time:** O(1) — The board size is fixed (9×9), so only a constant number of cells are checked.
- **Space:** O(1) — Each `HashSet` stores at most 9 digits.
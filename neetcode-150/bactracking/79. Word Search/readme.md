# 79. Word Search

## Approach

Use **DFS with backtracking** to search for the word starting from every cell that matches the first character.

Mark the current cell as visited by temporarily replacing its character with `$`.

Explore all four directions: up, down, left, and right.

If the next character matches, continue the DFS. After exploring, restore the original character to allow the cell to be used in other paths.

Return `true` when all characters of the word have been matched.

## Complexity

**Time:** O(m × n × 4^l), where `m × n` is the size of the board and `l` is the length of the word.

**Space:** O(l) due to the recursion stack, where `l` is the length of the word.
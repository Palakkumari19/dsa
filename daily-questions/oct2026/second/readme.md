# 22. Generate Parentheses

## Approach

Use **backtracking** to generate all valid combinations of `n` pairs of parentheses.

Keep track of the number of opening and closing parentheses used.

- Add `(` if `open < n`.
- Add `)` only if `close < open`, ensuring the parentheses remain valid.
- When `open == close == n`, add the current string to the result.

This avoids generating invalid combinations.

## Complexity

**Time:** O(4^n / √n), since there are `Cₙ` valid combinations, where `Cₙ` is the nth Catalan number.

**Space:** O(n) for the recursion stack and the current string, excluding the output.
# 40. Combination Sum II

## Approach

Use **backtracking** to find all unique combinations that sum to `target`.

First, sort the array so that duplicate values are adjacent.

For each candidate, add it to the current combination and recursively search for the remaining target starting from the next index.

Use `i + 1` in the recursive call so that each element can be used only once.

Skip duplicate candidates at the same recursion level using `if(i > idx && candidates[i] == candidates[i-1])` to avoid duplicate combinations.

If `target == 0`, add the current combination to the result.

## Complexity

**Time:** O(2^n), where `n` is the number of candidates, as each element can be either selected or skipped.

**Space:** O(n) due to the recursion stack and current combination, excluding the output.
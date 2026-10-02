# 39. Combination Sum

## Approach

Use **backtracking** to generate all possible combinations that sum to `target`.

For each candidate, there are two choices: either include the current candidate or skip it.

If the candidate is included, keep the same `idx` because the same number can be used multiple times.

If the candidate is skipped, move to the next index.

When `sum == target`, add the current combination to the result.

Stop the recursion when `sum > target` or all candidates have been processed.

## Complexity

**Time:** O(2^t), where `t` depends on the target and the smallest candidate.

**Space:** O(t) due to the recursion stack and current combination, excluding the output.
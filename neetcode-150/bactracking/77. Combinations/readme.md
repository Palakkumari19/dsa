# 77. Combinations

## Approach

Use **backtracking** to generate all possible combinations of `k` numbers from `1` to `n`.

At each number, there are two choices: include the number in the current combination or skip it.

If the number is included, add it to `temp` and recursively move to the next number with `k - 1`. After the recursive call, remove the number to backtrack and explore the choice of skipping it.

If `k == 0`, add a copy of the current combination to the result.

Stop the recursion if `start > n` or if the number of remaining available elements is less than `k`.

## Complexity

**Time:** O(k × C(n, k)), where C(n, k) is the total number of combinations. Copying each combination takes O(k) time.

**Space:** O(k) due to the recursion stack and current combination, excluding the output.
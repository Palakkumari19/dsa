# 78. Subsets

## Approach

Use **backtracking** to generate all possible subsets.

For each element, there are two choices: either include it in the current subset or exclude it.

Add the current element to `curr` and recursively process the next element. Then remove it using backtracking and recursively explore the choice of excluding it.

When all elements have been processed, add a copy of the current subset to the result.

## Complexity

**Time:** O(n × 2^n)

There are `2^n` possible subsets, and copying each subset into the result can take up to O(n) time.

**Space:** O(n) for the recursion stack and the current subset, excluding the output.
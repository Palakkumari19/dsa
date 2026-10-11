# 90. Subsets II

## Approach

Use **backtracking** to generate all unique subsets of the array.

First, sort the array so that duplicate elements are adjacent.

At each index, there are two choices: include the current element or skip it.

If the element is included, recursively process the next index. If it is skipped, move to the next distinct element by skipping all duplicates to avoid generating duplicate subsets.

When the index reaches the end of the array, add a copy of the current subset to the result.

## Complexity

**Time:** O(n × 2ⁿ)

There are at most \(2^n\) subsets, and copying each subset takes up to O(n) time.

**Space:** O(n)

The recursion stack and current subset require O(n) auxiliary space, excluding the output.
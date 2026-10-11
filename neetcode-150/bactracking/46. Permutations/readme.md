# 46. Permutations

## Approach

Use **backtracking** to generate all possible permutations of the array.

Maintain a `HashSet` to keep track of the elements that are already used in the current permutation.

For each position, try every unused element and add it to the current permutation.

After the recursive call, remove the element from the set and the current list to **backtrack** and try another possibility.

When the current permutation contains all `n` elements, add a copy of it to the result.

## Complexity

**Time:** O(n × n!)

There are `n!` possible permutations, and copying each permutation into the result takes O(n) time.

**Space:** O(n)

The recursion stack, current permutation, and `HashSet` can each require O(n) space, excluding the output.
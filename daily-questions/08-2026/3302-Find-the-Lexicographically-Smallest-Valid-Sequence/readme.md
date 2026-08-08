# 3302. Find the Lexicographically Smallest Valid Sequence

## Approach
- Build `rightMatch` to store how many characters of `word2` can be matched from each position in `word1` going backwards.
- Traverse `word1` from left to right, greedily matching characters with `word2`.
- If characters don't match, use the allowed change only when the remaining suffix can still complete `word2`.
- Return the lexicographically smallest valid sequence of indices.

## Complexity
- **Time:** O(n + m) — Two linear traversals of `word1` plus conversion of the result.
- **Space:** O(n + m) — `rightMatch` and the result arrays.
# 17. Letter Combinations of a Phone Number

## Approach

Use **backtracking** to generate all possible letter combinations for the given digits.

Create a HashMap to map each digit from `2` to `9` to its corresponding letters, similar to a phone keypad.

At each index, get the letters corresponding to the current digit and try each letter by appending it to the `StringBuilder`.

Recursively process the next digit, then remove the last character using backtracking to explore other possibilities.

When all digits have been processed, add the current combination to the result.

## Complexity

**Time:** O(4ⁿ × n), where `n` is the length of the digit string. Each digit can have up to 4 letters, and constructing each combination takes O(n) time.

**Space:** O(n) for the recursion stack and the current combination, excluding the output.
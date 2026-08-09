# 424. Longest Repeating Character Replacement

## Approach
- Use a sliding window and maintain the frequency of each character.
- Track the most frequent character in the current window.
- If the remaining characters require more than `k` replacements, shrink the window from the left.
- Keep track of the maximum valid window length.

## Complexity
- **Time:** O(n)
- **Space:** O(1) — Fixed-size array of 26 characters.
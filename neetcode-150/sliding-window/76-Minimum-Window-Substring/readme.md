# 76. Minimum Window Substring

## Approach
- Store the frequency of characters required from `t`.
- Use a sliding window over `s` and maintain how many required characters are currently matched.
- When the window contains all characters of `t`, shrink it from the left to find the minimum valid window.
- Track the smallest window and return it.

## Complexity
- **Time:** O(n) — Each character is added and removed from the window at most once.
- **Space:** O(1) — Uses a fixed-size array of 256 characters.
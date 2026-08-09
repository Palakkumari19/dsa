# 3. Longest Substring Without Repeating Characters

## Approach
- Use a sliding window with two pointers.
- Store the last seen index of each character in an array.
- When a duplicate is found, move the left pointer past its previous occurrence.
- Track the maximum window length.

## Complexity
- **Time:** O(n)
- **Space:** O(1) — Fixed-size array of 256 characters.
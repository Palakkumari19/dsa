# 3090. Maximum Length Substring With Two Occurrences

## Approach
- Use a sliding window with two pointers `l` and `r`.
- Maintain the frequency of each character using a `count[26]` array.
- Expand the window using `r`.
- If any character occurs more than twice, move `l` forward until the window becomes valid.
- Track the maximum valid window length.

## Complexity
- **Time:** O(n)
- **Space:** O(1)
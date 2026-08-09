# 567. Permutation in String

## Approach
- Store the character frequencies of `s1`.
- Use a sliding window of size `s1.length()` over `s2`.
- Maintain the frequency of characters in the current window.
- If the two frequency arrays are equal, the window is a permutation of `s1`.

## Complexity
- **Time:** O(n) — Each character enters and leaves the sliding window once.
- **Space:** O(1) — Two fixed-size arrays of 26 characters.
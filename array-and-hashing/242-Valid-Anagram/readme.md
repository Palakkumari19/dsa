# 242. Valid Anagram

## Approach

- If the strings have different lengths, they cannot be anagrams.
- Convert both strings into character arrays.
- Sort both arrays.
- Compare the sorted arrays. If they are identical, the strings are anagrams.

## Complexity

- **Time:** O(n log n)
- **Space:** O(n)
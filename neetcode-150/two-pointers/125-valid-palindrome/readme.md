# 125. Valid Palindrome

## Approach
- Remove all non-alphanumeric characters and convert the string to lowercase.
- Use two pointers, one starting from the beginning and the other from the end.
- Compare characters while moving the pointers inward.
- If any pair doesn't match, return `false`; otherwise, return `true`.

## Complexity
- **Time:** O(n) — One pass to preprocess the string and one pass for the two-pointer comparison.
- **Space:** O(n) — A new processed string is created after removing non-alphanumeric characters.
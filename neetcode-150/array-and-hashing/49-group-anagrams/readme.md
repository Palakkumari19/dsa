# 49. Group Anagrams

## Approach

- Iterate through each string in the array.
- Sort the characters of each string to create a unique key.
- Use a `HashMap` to group strings with the same sorted key.
- Return all the grouped anagrams from the map.

## Complexity

- **Time:** O(n × k log k)
  - `n` = number of strings
  - `k` = average length of each string
- **Space:** O(n × k)
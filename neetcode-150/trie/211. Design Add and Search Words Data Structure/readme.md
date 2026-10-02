# 211. Design Add and Search Words Data Structure

## Approach

Use a **Trie (Prefix Tree)** to store all added words.

For `addWord`, traverse the Trie character by character. If a character does not exist, create a new `TrieNode`. Mark the final node as the end of the word.

For `search`, use DFS to handle the `.` wildcard. For normal characters, move to the corresponding child node. When `.` is encountered, try all non-null children recursively and return `true` if any path forms a valid word.

At the end of the word, return `true` only if the current node represents the end of a stored word.

## Complexity

**Time:** O(n) for `addWord`.

For `search`, the worst case is **O(26^n)** when the word contains many `.` wildcards, since each wildcard can explore up to 26 children.

**Space:** O(n) for `addWord`.

For `search`, the recursion stack can use **O(n)** space, where `n` is the length of the word.
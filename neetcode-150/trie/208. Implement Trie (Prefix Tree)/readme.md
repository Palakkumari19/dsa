# 208. Implement Trie (Prefix Tree)

## Approach

Use a **Trie (Prefix Tree)** where each node contains an array of 26 child references and a boolean `flag` to indicate whether a complete word ends at that node.

For `insert`, traverse the Trie character by character. If a character does not exist, create a new node for it. Mark the final node as the end of the word.

For `search`, traverse the Trie using each character. If any character is missing, return `false`. After reaching the final node, return `true` only if it represents the end of a complete word.

For `startsWith`, traverse the Trie using the prefix. If all characters exist, the prefix is present in the Trie.

## Complexity

**Time:** O(n)

Each operation traverses the word/prefix once, where `n` is its length.

**Space:** O(n)

In the worst case, inserting a new word creates `n` new Trie nodes.
# 3345. Smallest Divisible Digit Product I

## Approach

- Start from `n` and check each number one by one.
- Compute the product of its digits.
- If the product is divisible by `t`, return the current number.
- Otherwise, increment the number and repeat.

## Complexity

- **Time:** O(k × d)
  - `k` = numbers checked before finding the answer
  - `d` = number of digits
- **Space:** O(1)
# 875. Koko Eating Bananas

## Approach
- Use binary search to find the minimum possible eating speed.
- For each speed, calculate the total hours needed to finish all piles.
- If the required hours are within `h`, try a smaller speed; otherwise, increase the speed.

## Complexity
- **Time:** O(n log m) — Each binary search step checks all `n` piles, where `m` is the maximum pile size.
- **Space:** O(1) — Uses only a few extra variables.
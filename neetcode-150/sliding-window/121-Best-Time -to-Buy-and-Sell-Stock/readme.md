# 121. Best Time to Buy and Sell Stock

## Approach
- Track the minimum buying price seen so far.
- For each price, calculate the profit if selling on that day.
- Keep updating the maximum profit.

## Complexity
- **Time:** O(n)
- **Space:** O(1)
# 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

## Approach

Use the **sliding window** technique to maintain the sum of the current sub-array of size `k`.

First, calculate the sum of the first `k - 1` elements. Then slide the window through the array by adding the new element and removing the element that leaves the window.

For each window, check whether its average is greater than or equal to the threshold. If it is, increment the result.

## Complexity

**Time:** O(n)

Each element is added to and removed from the sliding window at most once. Therefore, the entire array is traversed in **O(n)** time.

**Space:** O(1)

Only a few variables are used to maintain the current window sum and result, so no extra space proportional to the input size is required.
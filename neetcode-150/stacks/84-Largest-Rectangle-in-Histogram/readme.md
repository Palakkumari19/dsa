**# 84. Largest Rectangle in Histogram**

**## Approach**

* Use a **monotonic increasing stack** to store the indices of histogram bars.
* Traverse the `heights` array and whenever the current bar is smaller than the bar at the top of the stack, calculate the maximum rectangle using the popped bar as the height.
* The **next smaller element** is the current index, while the **previous smaller element** is the new top of the stack after popping.
* Calculate the width as `nse - pse - 1` and update the maximum area.
* After traversing the array, process the remaining elements in the stack by considering `n` as the next smaller element.
* Return the maximum area found.

**## Complexity**

* ****Time:**** O(n)
* ****Space:**** O(n)

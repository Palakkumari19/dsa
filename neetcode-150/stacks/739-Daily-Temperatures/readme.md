**# 739. Daily Temperatures**

**## Approach**

* Use a **monotonic stack** to store the temperature and its index.
* Traverse the `temperatures` array from left to right.
* For each temperature, compare it with the temperature at the top of the stack.
* If the current temperature is warmer, pop the previous day and calculate the number of days waited.
* Continue popping while the current temperature is greater than the stack's top temperature.
* Push the current temperature and its index onto the stack.
* Days that remain in the stack have no warmer future day, so their answer remains `0`.

**## Complexity**

* ****Time:**** O(n)
* ****Space:**** O(n)

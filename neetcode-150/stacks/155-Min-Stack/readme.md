**# 5. Min Stack**

**## Approach**

* Use two stacks: one regular stack to store all elements and one `minStack` to track the minimum element.
* On `push`, add the value to the regular stack and push it to `minStack` if it is smaller than or equal to the current minimum.
* On `pop`, remove the top element from the regular stack and also remove it from `minStack` if it is the current minimum.
* `top()` returns the top element of the regular stack.
* `getMin()` returns the top element of `minStack`, giving the minimum in constant time.

**## Complexity**

* ****Time:**** O(1) for each operation
* ****Space:**** O(n)

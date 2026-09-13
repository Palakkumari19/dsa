**# 150. Evaluate Reverse Polish Notation**

**## Approach**

* Use a stack to store operands.
* Traverse the tokens array from left to right.
* If the token is a number, convert it to an integer and push it onto the stack.
* If the token is an operator (`+`, `-`, `*`, `/`), pop the top two operands from the stack.
* Perform the operation and push the result back onto the stack.
* The final value remaining in the stack is the answer.

**## Complexity**

* ****Time:**** O(n)
* ****Space:**** O(n)

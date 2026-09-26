import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String x : tokens){
            if(x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")){
                int num2 = st.pop();
                int num1 = st.pop();
                switch(x){
                    case "+":
                        st.push(num1 + num2);
                        break;
                    case "-":
                        st.push(num1 - num2);
                        break;
                    case "*":
                        st.push(num1 * num2);
                        break;
                    case "/":
                        st.push(num1 / num2);
                        break;
                }
            }else{
                st.push(Integer.parseInt(x));
            }
        }
        return st.pop();
    }
}
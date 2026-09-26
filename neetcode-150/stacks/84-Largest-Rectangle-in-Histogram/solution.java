import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int n = heights.length, maxArea = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            while(!st.empty() && heights[i]<heights[st.peek()]){
                int ele = heights[st.peek()];
                st.pop();
                int nse = i;
                int pse = st.empty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, (ele * (nse-pse-1)));
            }
            st.push(i);
        }
        while(!st.empty()){
            int nse = n;
            int ele = heights[st.peek()];
            st.pop();
            int pse = st.empty() ? -1 : st.peek();
            maxArea = Math.max(maxArea, (ele * (nse-pse-1)));
        }
        return maxArea;
    }
}
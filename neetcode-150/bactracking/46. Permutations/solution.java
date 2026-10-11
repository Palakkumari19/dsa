import java.util.*;
class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int n ;
    Set<Integer> st = new HashSet<>();

    public void helper(int[] nums, List<Integer> curr){
        if(curr.size()==n){ 
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<n;i++){
            if(!st.contains(nums[i])){
                st.add(nums[i]);
                curr.add(nums[i]);
                helper(nums,curr);
                st.remove(nums[i]);
                curr.remove(curr.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        n = nums.length;
        helper(nums, curr);
        return res;
    }
}
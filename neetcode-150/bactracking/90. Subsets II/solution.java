import java.util.*;
class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public void helper(int[] nums, int i, List<Integer> curr){
        if(i>=nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        helper(nums,i+1,curr);
        curr.remove(curr.size()-1);
        int j=i+1;
        while(j<nums.length && nums[j]==nums[i])
            j++;
        helper(nums, j, curr);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,curr);
        return res;
    }
}
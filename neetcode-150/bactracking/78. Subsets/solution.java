import java.util.*;;
class Solution {
    List<List<Integer>>  ans = new ArrayList<>() ;
    

    public void solve(int[] nums,int  idx,List<Integer> curr){
        if(idx>=nums.length){
            ans.add(new ArrayList<>(curr));
            return ;    
        }
        curr.add(nums[idx]);
        solve(nums,idx+1,curr);
        curr.remove(curr.size()-1);  
        solve(nums, idx+1, curr);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        solve(nums,0,curr );
        return ans;
    }
}
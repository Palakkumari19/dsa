import java.util.*;
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int[] candidates, int target, int idx, List<Integer> curr){
        if(target<0)    return;
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]== candidates[i-1])  continue;
            curr.add(candidates[i]);
            solve(candidates,target - candidates[i], i+1,curr );
            curr.remove(curr.size()-1);
        }
        
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, curr);
        return ans;
    }
}
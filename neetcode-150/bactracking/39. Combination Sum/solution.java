class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int[] candidates, int target, int sum, int idx, List<Integer> curr){
        if( target == sum){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(idx==candidates.length || sum > target){
            return;
        }
        curr.add(candidates[idx]);
        solve(candidates, target, sum + candidates[idx] ,idx,curr);
        curr.remove(curr.size()-1);
        solve(candidates, target, sum, idx+1,curr);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        solve(candidates, target, 0, 0, curr);
        return ans;
    }
}
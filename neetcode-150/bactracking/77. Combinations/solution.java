class Solution {

    List<List<Integer>> res = new ArrayList<>();

    public void helper(int n, int start, int k, List<Integer> temp){
        
        if(k==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(start>n || k> n-start+1){
            return;
        }
        temp.add(start);
        helper(n,start+1,k-1,temp);
        temp.remove(temp.size()-1);
        helper(n,start+1,k,temp);
    }

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        helper(n,1,k,temp);
        return res;
    }
}
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int j = i+1, k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0)
                    j++;
                else if(sum>0)
                    k--;
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while(nums[j] == nums[j-1] && j<k)
                        j++;
                    while(nums[k] == nums[k+1] && j<k)
                        k--;
                }
            }
        }
        return res;
    }
}
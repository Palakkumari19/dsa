import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length, len =1, maxLen=0;
        int last = Integer.MIN_VALUE;
        if(nums.length==1)
            return 1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]-1 == last)
                len++;
            else if(nums[i] != last)
                len =1;
            maxLen = Math.max(len,maxLen);
            last = nums[i];
        }
        return maxLen;
    }
}
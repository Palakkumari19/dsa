// leetcode 27 - remove element
// link - https://leetcode.com/problems/remove-element/description/

package arrays;
class Solution {
    public int removeElement(int[] nums, int val) {
        int left=0,right=0;
        while(right<nums.length){
            if(nums[right]!= val){
                nums[left] = nums[right];
                right++;
                left++;
            }
            else    right++;
        }
        return left;
    }
}
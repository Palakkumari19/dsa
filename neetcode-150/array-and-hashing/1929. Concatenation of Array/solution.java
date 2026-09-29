class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[2*nums.length];
        int i=0;
        while(i<nums.length){
            res[i] = nums[i];
            res[i+nums.length] = nums[i];
            i++;
        }
        return res;
    }
}
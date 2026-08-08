class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r = findMax(piles);
        while(l<=r){
            int m  = l+(r-l)/2;
            long hours = hour(piles, m);
            if(hours<=h)
                r = m-1;
            else
                l = m+1;
        }
        return l;
    }
    public int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>max)
                max = arr[i];
        return max;
    }
    public long hour(int[] arr, int m){
        long hours =0;
        for(int i=0;i<arr.length;i++)
            hours += Math.ceil((double)arr[i] / (double)m);
        return hours;
    }
}
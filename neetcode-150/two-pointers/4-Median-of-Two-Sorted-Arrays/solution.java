import java.util.*;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] arr = new int[n+m];
        for(int i=0;i<n;i++)
            arr[i] = nums1[i];
        int j=0; 
        for(int i = n;i<m+n;i++){
            arr[i] = nums2[j];
            j++;
        }
        Arrays.sort(arr);
        int mid = (n+m-1)/2;
        if((n+m)%2 == 0)
            return ((double)arr[mid]+(double)arr[mid+1])/2;
        return (double)arr[mid];
    }
}
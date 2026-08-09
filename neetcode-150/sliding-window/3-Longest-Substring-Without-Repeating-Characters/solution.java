import java.util.*;;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0, r=0, len=0, maxLen=0;
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        while(r<s.length()){
            char ch1 = s.charAt(l);
            char ch2 = s.charAt(r);
            if(hash[ch2]!=-1)
                l = Math.max(l, hash[ch2]+1);
            len = r-l+1;
            maxLen = Math.max(maxLen, len);
            hash[ch2] =r;
            r++;
        }
        return maxLen;
    }
}
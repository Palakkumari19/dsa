class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int l=0,r=0, maxLen=0;
        while(r<s.length()){
            char ch = s.charAt(r);
            count[ch-'a']++;
            while(count[ch-'a'] > 2 && l<s.length()){
                char ch2 = s.charAt(l);
                count[ch2-'a']--;
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);
            r++;
        }
        return maxLen;
    }
}
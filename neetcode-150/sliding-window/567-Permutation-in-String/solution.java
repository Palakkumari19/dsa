import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] hash1 = new int[26];
        for(int i=0;i<s1.length();i++)
            hash1[s1.charAt(i)-'a']++;
        int l=0,r=0;
        int[] hash2 = new int[26];
        while(r<s2.length()){     
            hash2[s2.charAt(r)-'a']++;
            if((r-l+1)>s1.length()){
                hash2[s2.charAt(l)-'a']--;
                l++;
            }
            if((r-l+1)==s1.length() && Arrays.equals(hash1,hash2))
                return true;
            r++;
        }
        return false;
    }
}
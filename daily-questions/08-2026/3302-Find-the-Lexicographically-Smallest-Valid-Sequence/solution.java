import java.util.*;

class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length(), m = word2.length(), match =0;
        int[] rightMatch = new int[n+1];
        int i=n-1, j=m-1;
        while(i>=0){
            if(j>=0 && word1.charAt(i) == word2.charAt(j)){
                match++;
                j--;
            }
            rightMatch[i] = match;
            i--;
        }
        boolean canChange = true;
        i =0;
        j=0;
        List<Integer> res = new ArrayList<>();
        while(i<n && j<m){
            if(word1.charAt(i) == word2.charAt(j)){
                res.add(i);
                j++;
            }
            else if(canChange && (rightMatch[i+1] >= m-j-1)){
                res.add(i);
                j++;
                canChange = false;
            }
            i++;
        }
        if(j==m){
            int[] ans = new int[res.size()];
            for(i=0;i<res.size();i++)
                ans[i] = res.get(i);
            return ans;
        }
        return new int[]{};
    }
}
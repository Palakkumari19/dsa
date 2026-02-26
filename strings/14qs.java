// 14. Longest Common Prefix
// link - https://leetcode.com/problems/longest-common-prefix/description/

package strings;
import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length -1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i])   break;
            sb.append(first[i]);
        }
        return sb.toString();
    }
}
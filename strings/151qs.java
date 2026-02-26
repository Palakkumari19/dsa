// 151. Reverse Words in a String
// link - https://leetcode.com/problems/reverse-words-in-a-string/
package strings;
class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1 ; i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
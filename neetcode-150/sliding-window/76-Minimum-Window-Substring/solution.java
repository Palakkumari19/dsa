class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length())
            return "";
        int[] hash = new int[256];
        for(int i=0;i<t.length();i++)
            hash[t.charAt(i)]++;
        int l=0,r=0,count=0, minLen= Integer.MAX_VALUE, idx =-1;
        while(r<s.length()){
            if(hash[s.charAt(r)]>0)
                count++;
            hash[s.charAt(r)]--;
            while(count == t.length()){
                if(r-l+1<minLen){
                    minLen = r-l+1;
                    idx =l;
                }
                hash[s.charAt(l)]++;
                if(hash[s.charAt(l)] > 0)
                    count--;
                l++;
            }
            r++;
        }
        return (idx==-1) ? "" : s.substring(idx, idx+minLen);
    }
}

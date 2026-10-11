class Solution {
    HashMap<Character, String> map = new HashMap<>();
    List<String> res = new ArrayList<>();

    public void helper(String digits, int idx, StringBuilder temp){
        if(idx>=digits.length()){
            res.add(temp.toString());
            return;
        }
        char ch = digits.charAt(idx);
        String str = map.get(ch);
        for(int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            helper(digits, idx+1,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder temp = new StringBuilder();
        helper(digits, 0, temp);
        return res;
    }
}
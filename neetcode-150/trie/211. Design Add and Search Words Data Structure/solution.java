class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean flag = false;
}

class WordDictionary {

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
        
    }
    
    public void addWord(String word) {
        TrieNode curr = root;
        for(char ch : word.toCharArray()){
            if(curr.children[ch-'a']==null)
                curr.children[ch-'a'] = new TrieNode();
            curr = curr.children[ch-'a'];
        }
        curr.flag = true;
    }
    
    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    public boolean dfs(String word, int j, TrieNode root){
        TrieNode curr = root;
        for(int i=j;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch=='.'){
                for(TrieNode child : curr.children){
                    if(child!=null && dfs(word, i+1, child))
                        return true;}
                return false;
            }
            else{
                if(curr.children[ch-'a'] == null)
                    return false;
                curr = curr.children[ch-'a'];
            }
        }
        return curr.flag;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
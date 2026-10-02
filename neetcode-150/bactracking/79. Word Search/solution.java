class Solution {
    int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
    int l,m,n;
    public boolean find(char[][] board,String word, int idx, int i, int j){
        if(idx >= l)    return true;
        if(i<0 || j<0||i>=m||j>=n || board[i][j] != word.charAt(idx))
            return false;
        char temp = board[i][j];
        board[i][j] = '$';
        for(int[] dir : directions){
            int i_ =  i + dir[0];
            int j_ = j + dir[1];
            if(find(board,word,idx+1,i_,j_))
                return true;
        }
        board[i][j] = temp;
        return false;
    }

    public boolean exist(char[][] board, String word) {
         m = board.length;
         n = board[0].length;
         l = word.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                if(board[i][j] == word.charAt(0) && find(board,word, 0, i,j))
                    return true;
        }
        return false;
    }
}
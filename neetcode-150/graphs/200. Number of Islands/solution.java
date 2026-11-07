class Solution {
    public void dfs(char[][] grid, int[][] vis, int r, int c, int m , int n){
        if(r<0 || r>=m || c<0 || c>=n || vis[r][c] ==1 || grid[r][c] == '0')    return;
        vis[r][c] = 1;
        dfs(grid,vis,r+1,c,m,n);
        dfs(grid,vis,r-1,c,m,n);
        dfs(grid,vis,r,c+1,m,n);
        dfs(grid,vis,r,c-1,m,n);
    }

    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] vis = new int[m][n];
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(vis[i][j]==0 && grid[i][j]=='1'){
                    count++;
                    dfs(grid, vis, i,j,m,n);
                }
            }
        }
        return count;
    }
}
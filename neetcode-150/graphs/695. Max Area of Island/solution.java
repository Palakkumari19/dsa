class Solution {

    private static final int[][] dir = { {-1,0},{1,0},{0,-1},{0,1}};

    public int dfs(int[][] grid, int[][] vis, int r, int c){
        if(r<0 || r>=grid.length || c<0 || c>= grid[0].length || vis[r][c]==1 || grid[r][c]==0)
            return 0;
        vis[r][c] =1;
        int area = 1;
        for(int[] d :dir){
            area += dfs(grid,vis, r+d[0], c+d[1]);
        }
        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length];
        int maxArea = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(vis[i][j]==0 && grid[i][j]==1){
                    int area = dfs(grid, vis, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}
class Solution {
    int[][] dir = {
        {-1,0},{1,0},{0,1},{0,-1},{-1,1},{-1,-1},{1,-1},{1,1}
    };
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0]!=0 || grid[n-1][n-1]!=0)  return -1;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0,1});
        int len= 1;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int x = curr[0], y = curr[1];
            len = curr[2];
            if(x==n-1 && y ==n-1)   return len;
            for(int[] d: dir){
                int x_ = x+d[0];
                int y_ = y+d[1];
                if(x_>=0 && x_<n && y_>=0 && y_<n && grid[x_][y_]==0){
                    grid[x_][y_] =1;
                    q.add(new int[]{x_,y_,len+1});
                }
            }
        }
        return -1;
    }
}
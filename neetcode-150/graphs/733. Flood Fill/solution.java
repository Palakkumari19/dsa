class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int orig = image[sr][sc];
        int m = image.length, n = image[0].length;
        if(orig == color)   return image;
        dfs(image, sr,sc,color, orig, m ,n);
        return image; 
    }
    public void dfs(int[][] image, int r, int c, int color, int orig, int m, int n){
        if(r<0 || r>=m || c<0 || c>=n || image[r][c] != orig) return;
        image[r][c] = color;
        dfs(image, r+1, c,color,orig,m,n);
        dfs(image, r-1, c,color,orig,m,n);
        dfs(image, r, c+1,color,orig,m,n);
        dfs(image, r, c-1,color,orig,m,n);
    }
}
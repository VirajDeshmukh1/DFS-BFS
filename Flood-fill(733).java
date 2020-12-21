class Solution {
    int color;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
       if(image==null || image[sr][sc]==newColor)
           return image;
        color = image[sr][sc];
        dfs(image, sr, sc, newColor);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int newColor){
        //base
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[sr].length || image[sr][sc]!=color)
            return;
        //logic
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        image[sr][sc] = newColor;
        for(int[] dir : dirs){
            int r = dir[0] + sr;
            int c = dir[1] + sc;
            dfs(image, r, c, newColor);
        }
    }
}
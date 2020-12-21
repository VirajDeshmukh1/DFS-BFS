//BFS SOLUTION  
// Time Complexity : O(M *N)
// Space Complexity : O(1)

class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        if(matrix==null || matrix.length==0)
            return matrix;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    q.add(new int[]{i, j});
                }else{
                    matrix[i][j] = -1;
                }
            }
        }
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        int dist = 1;
       while(!q.isEmpty()){
           int size = q.size();
           for(int i=0;i<size;i++){
               int[]curr = q.poll();
               for(int[] dir : dirs){
                   int r = dir[0] + curr[0];
                   int c = dir[1] + curr[1];
                   if(r>=0 && r<matrix.length && c>=0 && c<matrix[r].length && matrix[r][c]==-1){
                       q.add(new int[] {r, c});
                       matrix[r][c] = dist;
                   }
               }
           }
           dist++;
       }
        return matrix;
    }
}

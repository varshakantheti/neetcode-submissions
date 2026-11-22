class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int r= 0; r<grid.length; r++){
            for(int c=0; c<grid[0].length;c++){
                int count = 0;
                if(grid[r][c]!=0){
                    Queue<int[]> q = new ArrayDeque<>();
                    q.offer(new int[]{r,c});
                    grid[r][c] = 0;
                    while(!q.isEmpty()){
                        int[] cur = q.poll();
                        int row = cur[0];
                        int col = cur[1];
                        count++;
                        if(row!=0 && grid[row-1][col]!=0){
                            q.offer(new int[]{row-1,col});
                            grid[row-1][col] = 0;
                        }
                        if(row!=grid.length-1 && grid[row+1][col]!=0){
                            q.offer(new int[]{row+1,col});
                            grid[row+1][col] = 0;
                        }
                        if(col!=0 && grid[row][col-1]!=0){
                            q.offer(new int[]{row,col-1});
                            grid[row][col-1] = 0;
                        }
                        if(col!=grid[0].length-1 && grid[row][col+1]!=0){
                            q.offer(new int[]{row,col+1});
                            grid[row][col+1] = 0;
                        }
                    }
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}

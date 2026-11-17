class Solution {
    public int numIslands(char[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int ret=0;
        for(int row = 0; row<grid.length; row++){
            for(int col = 0; col<grid[0].length; col++){
                if(grid[row][col]=='1'){
                    q.offer(new int[]{row, col});
                    grid[row][col] = 0;
                    ret++;
                }
                while(!q.isEmpty()){
                    int[] cur = q.poll();
                    int c = cur[1];
                    int r = cur[0];
                    if(c!=0 && grid[r][c-1]=='1'){
                        q.offer(new int[]{r,c-1});
                        grid[r][c-1]='0';
                    }
                    if(c!=grid[0].length-1 && grid[r][c+1]=='1'){
                        q.offer(new int[]{r,c+1});
                        grid[r][c+1]='0';
                    }
                    if(r!=0 && grid[r-1][c]=='1'){
                        q.offer(new int[]{r-1,c});
                        grid[r-1][c]='0';
                    }
                    if(r!=grid.length-1 && grid[r+1][c]=='1'){
                        q.offer(new int[]{r+1,c});
                        grid[r+1][c]='0';
                    }
                }
            }
        }
        return ret;
    }
}

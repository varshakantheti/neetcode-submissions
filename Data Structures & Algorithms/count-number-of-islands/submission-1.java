class Solution {
    public int numIslands(char[][] grid) {
        int ret = 0;
        int col = grid[0].length;
        int row = grid.length;
        // r,c
        for(int r=0; r<row; r++){
            for(int c = 0; c<col; c++){
                if(grid[r][c]=='1'){
                    grid = bfs(grid, r, c);
                    ret++;
                }
            }
        }
        return ret;
    }
    public char[][] bfs(char[][] grid, int r, int c) {
       Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{r,c});
        grid[r][c] = '0';
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int rr = temp[0];
            int cc = temp[1];
            if(rr!=0 && grid[rr-1][cc]=='1'){
                q.offer(new int[]{rr-1,cc});
                grid[rr-1][cc] = '0';
            }
            if(rr!=grid.length-1 && grid[rr+1][cc]=='1'){
                q.offer(new int[]{rr+1,cc});
                grid[rr+1][cc] = '0';
            }
            if(cc!=0 && grid[rr][cc-1]=='1'){
                q.offer(new int[]{rr,cc-1});
                grid[rr][cc-1] = '0';
            }
            if(cc!=grid[0].length-1 && grid[rr][cc+1]=='1'){
                q.offer(new int[]{rr,cc+1});
                grid[rr][cc+1] = '0';
            }
        }
        return grid;
    }
}

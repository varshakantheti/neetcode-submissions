class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        int col = grid[0].length;
        int row = grid.length;
        int freshCount = 0;
        int time = 0;
        for(int r=0; r<row; r++){
            for(int c=0; c<col; c++){
                if(grid[r][c]==2){
                    q.offer(new int[]{r,c});
                }
                if(grid[r][c]==1){
                    freshCount++;
                }
            }
        }
        while(!q.isEmpty() && freshCount!=0){
            time++;
            int countr = q.size();
            while(countr>0){
                countr--;
                int[] rotten = q.poll();
                int c = rotten[1];
                int r = rotten[0];
                if(c>0 && grid[r][c-1]==1){
                    freshCount--;
                    grid[r][c-1]=2;
                    q.offer(new int[]{r, c-1});
                }
                if(c<col-1 && grid[r][c+1]==1){
                    freshCount--;
                    grid[r][c+1]=2;
                    q.offer(new int[]{r, c+1});
                }
                if(r<row-1 && grid[r+1][c]==1){
                    freshCount--;
                    grid[r+1][c]=2;
                    q.offer(new int[]{r+1, c});
                }
                if(r>0 && grid[r-1][c]==1){
                    freshCount--;
                    grid[r-1][c]=2;
                    q.offer(new int[]{r-1, c});
                }
            }
        }
        if (freshCount != 0) {
            return -1;
        }
        return time;

    }
}

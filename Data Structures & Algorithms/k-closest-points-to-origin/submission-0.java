class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ret = new int[k][2];
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        for(int[] point : points){
            int distance = (point[0])*(point[0]) + (point[1])*(point[1]);
            q.offer(new int[]{distance,point[0],point[1]});
        }
        while(k>0){
            int[] temp = q.poll();
            ret[k-1] = new int[]{temp[1], temp[2]};
            k--;
        }
        return ret;
    }
}

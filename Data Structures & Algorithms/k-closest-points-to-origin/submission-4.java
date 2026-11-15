class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ret = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> (b[0]*b[0] + b[1]*b[1])- ((a[0]*a[0] + a[1]*a[1]))
        );
        for(int[] point : points){
            pq.offer(point);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(pq.size()!=0){
            ret[pq.size()-1] = pq.poll();
        }
        return ret;
    }
}

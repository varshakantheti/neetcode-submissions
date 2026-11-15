class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int stone : stones){
            pq.offer(stone*-1);
        }
        while(pq.size()>1){
            int one = pq.poll();
            int two = pq.poll();
            if(Math.abs(one-two)!=0){
                pq.offer((Math.abs(one-two))*-1);
            }
        }
        if(pq.size()==0){
            return 0;
        }
        return (Math.abs(pq.poll()));
    }
}

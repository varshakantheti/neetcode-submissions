class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int stone: stones){
            q.offer((stone)*-1);
        }
        while(!q.isEmpty()){
            int stone1 = q.poll();
            if(q.isEmpty()){
                return (stone1/-1);
            }
            int stone2 = q.poll();
            if(stone1!=stone2){
                q.offer((stone1-stone2));
            }
        }
        return 0;
    }
}

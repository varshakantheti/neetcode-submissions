class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> b-a
        );
        //count, index waiting for
        int index = 0;
        Queue<int[]> q = new ArrayDeque<>();
        int[] counts = new int[26];
        for(char c: tasks){
            counts[c-'A']++;
        }
        for(int i : counts){
            if(i!=0){
                pq.offer(i);
            }
        }
        // 3 1 1
        while(pq.size()!=0 || q.size()!=0){
            while(!q.isEmpty() && q.peek()[1] <=index){
                pq.offer(q.poll()[0]);
            }
            if(!pq.isEmpty()){
                int t = pq.poll();
                if(t>1){
                    q.offer(new int[]{t-1, index+n+1});
                }
            }
            index++;
        }
        return index;
    }
}

class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Queue<int[]> cooldown = new LinkedList<>();
        int[] letter = new int[26];
        int cur = 0;
        for(char task : tasks){
            letter[task-'A']++;
        }
        for(int l :letter){
            if (l>0){
                q.offer((l*-1));
            }
        }
        while(q.size()!=0 || cooldown.size()!=0){
            cur++;
            if (!q.isEmpty()) {
                int temp = q.poll() + 1;
                if (temp < 0) {
                    cooldown.offer(new int[]{temp, cur + n});
                }
            }
            if (!cooldown.isEmpty() && cooldown.peek()[1] <= cur) {
                q.offer(cooldown.poll()[0]);
            }
        }
        return cur;
    }
}

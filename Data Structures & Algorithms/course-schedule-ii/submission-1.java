class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //hashmap- map prereq to corses that depend on it 0,1
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        // 0 if no prereqs 1 if prereqs 2 is 2 prereqs
        int[] ready = new int[numCourses];
        //output
        int[] ret = new int[numCourses];
        //q
        Queue<Integer> q = new ArrayDeque<>();
        int index = -1;
        for(int i = 0; i<numCourses; i++){
            ArrayList<Integer> a = new ArrayList<>();
            map.put(i,a);
        }
        for(int[] each : prerequisites){
            int one = each[0];
            int pre = each[1];
            map.get(pre).add(one);
            ready[one]++;
        }
        for(int i=0; i<ready.length; i++){
            if(ready[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int temp = q.poll();
            index++;
            ret[index] = temp;
            ArrayList<Integer> t = map.get(temp);
            for(int j : t){
                ready[j]--;
                if(ready[j]==0){
                    q.offer(j);
                }
            }
        }
        if(index!=numCourses-1){
            return new int[]{};
        }
        return ret;

    }
}

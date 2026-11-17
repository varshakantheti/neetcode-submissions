class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Hashmap that maps course to which courses its a prereq for
        //int[] that holds how many prereqs each class has - if none are 0 then return false
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int[] prereq = new int[numCourses];
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i<numCourses; i++){
            ArrayList<Integer> a = new ArrayList<>();
            map.put(i,a);
        }
        for(int[] pair : prerequisites){
            map.get(pair[1]).add(pair[0]);
            prereq[pair[0]]++;
        }
        for(int i=0; i<prereq.length; i++){
            if(prereq[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int temp = q.poll();
            if(map.containsKey(temp)){
                for(int m : map.get(temp)){
                    prereq[m]--;
                    if(prereq[m]==0){
                        q.offer(m);
                    }
                }
            }
        }
        for(int y : prereq){
            if(y!=0){
                return false;
            }
        }
        return true;
    }
}

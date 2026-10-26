class Solution {
    
    public int carFleet(int target, int[] position, int[] speed) {
        int ret = 0;
        double shortest = 0;
        boolean cur = false;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i=0; i<position.length; i++){
            myMap.put(position[i], speed[i]);
        }
        Arrays.sort(position);
        for(int i=position.length-1; i>=0; i--){
            double left = (target - position[i])/((double) (myMap.get(position[i])));
            if(left > shortest){
                shortest = left;
                ret++;
            }
        }
        return ret;
    }
}

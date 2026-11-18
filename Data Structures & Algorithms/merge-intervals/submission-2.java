class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        if(intervals.length==1){
            return intervals;
        }
        ArrayList<int[]> ret = new ArrayList<>();
        ret.add(intervals[0]);
        for(int i=1; i<intervals.length; i++){
            int[] prev = ret.get(ret.size()-1);
            //merge
            if(intervals[i][0]<=prev[1]){
                ret.set(ret.size()-1, new int[]{Math.min(intervals[i][0], prev[0]), Math.max(intervals[i][1],prev[1])});
                //dont merge
            } else {
                ret.add(intervals[i]);
            }
        }
        return ret.toArray(new int[ret.size()][2]);
    }
}

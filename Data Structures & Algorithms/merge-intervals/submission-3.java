class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        Stack<int[]> stack = new Stack<>();
        if(intervals.length==1){
            return intervals;
        }
        for(int[] each : intervals){
            if(stack.isEmpty()){
                stack.push(each);
            } else {
                int[] temp = stack.peek();
                if(each[0]<=temp[1]){
                    stack.pop();
                    stack.push(new int[]{temp[0],Math.max(temp[1],each[1])});
                } else {
                    stack.push(each);
                }
            }
        }
        return stack.toArray(new int[stack.size()][]);
    }
}

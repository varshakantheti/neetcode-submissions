class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> myStack = new Stack<>();
        int curr = 0;
        int maxx = Integer.MIN_VALUE;
        for(int i=0; i<heights.length;i++){
            int start = i;
            //stack is empty
            if(!myStack.isEmpty()){
                //peek is > this means we pop
                while(!myStack.isEmpty() && myStack.peek()[1]>heights[i]){
                    int[] temp = myStack.pop();
                    int tempHeight = temp[1];
                    int tempIndex = temp[0];
                    int val = (i-tempIndex) * tempHeight;
                    maxx = Math.max(val, maxx);
                    start = tempIndex;
                } 
                if (!myStack.isEmpty() && myStack.peek()[1]==heights[i]){
                //peek is = this means we dont add
                    continue;
                } else {
                    myStack.push(new int[]{start,heights[i]});
                }

            } else {
                //else add value to stack
                myStack.push(new int[]{i,heights[i]});
            }    
        }
        int i = heights.length;
        while(!myStack.isEmpty()){
            int[] temp = myStack.pop();
            int tempHeight = temp[1];
            int tempIndex = temp[0];
            int val = (i-tempIndex) * tempHeight;
            maxx = Math.max(val, maxx);
        }
        return maxx;
    }
}

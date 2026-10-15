class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> myStack = new Stack<>();
        int[] ret = new int[temperatures.length];
        for(int i = 0; i<=temperatures.length-1; i++){
            if( !myStack.isEmpty() && temperatures[i] > temperatures[myStack.peek()]){
                while(!myStack.isEmpty() && temperatures[myStack.peek()]<temperatures[i]){
                    int temp = myStack.pop();
                    ret[temp] = i - temp;
                }
            }
            myStack.push(i);
        }
        while(!myStack.isEmpty()){
            int f = myStack.pop();
            ret[f] = 0;
        }
        return ret;
    }
}

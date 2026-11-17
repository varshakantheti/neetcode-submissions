class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //create stack with index
        Stack<Integer> s = new Stack<>();
        int[] output = new int[temperatures.length];
        for(int i = 0; i<temperatures.length; i++){
            while(!s.isEmpty()){
                int temp = s.peek();
                if( temperatures[i]>temperatures[temp]){
                    temp = s.pop();
                    output[temp] = i-temp;
                } else{
                    break;
                }
            }
            s.push(i);
        }
        return output;
    }
}

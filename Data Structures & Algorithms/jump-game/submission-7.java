class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        while(goal!=0){
            for(int i=goal-1; i>=0;i--){
                int need = goal - i;
                if(i==0 && nums[i]<need){
                    return false;
                } else if (nums[i]>=need){
                    goal = i;
                }
            }
        }
        return true;
    }
}

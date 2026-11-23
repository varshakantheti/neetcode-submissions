class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==1){
            return Math.max(nums[0],nums[1]);
        }
        return Math.max(robHelper(nums,1,nums.length-1), robHelper(nums,0,nums.length-2));
    }
    public int robHelper(int[] nums, int start, int end) {
        int one = 0; int two = 0;
        for(int i= start; i<=end; i++){
            int temp = two;
            two = Math.max(two, one+nums[i]);
            one = temp;
        }
        return two;
    }
}

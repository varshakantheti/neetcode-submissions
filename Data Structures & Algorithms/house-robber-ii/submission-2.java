class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(robhelper(nums, 0, nums.length-2), robhelper(nums,1,nums.length-1));
    }
    public int robhelper(int[] nums, int start, int end){
        int rob1 = 0;
        int rob2 = 0;
        int temp = 0;
        for(int num = start; num<=end; num++){
            temp = Math.max(nums[num]+rob1,rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return temp;
    }
}

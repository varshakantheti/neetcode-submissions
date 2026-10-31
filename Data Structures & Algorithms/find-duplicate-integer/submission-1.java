class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            int temp = nums[i];
            if(nums[i]<0){
                temp = temp * -1;
            }
            if(nums[temp]<0){
                return temp;
            } else {
                nums[temp] *= -1;
            }
        }
        return 0;
    }
}

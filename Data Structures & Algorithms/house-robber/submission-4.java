class Solution {
    public int rob(int[] nums) {
        int one = 0;
        int two = 0;
        for(int num: nums){
            int temp = two;
            two = Math.max(one+num,two);
            one = temp;
        }
        return two;
    }
}


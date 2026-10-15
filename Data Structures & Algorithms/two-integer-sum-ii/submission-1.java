class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length -1;
        int[] ret = new int[2];
        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum > target){
                r--;
            } else if (sum == target){
                ret[0] = l+1;
                ret[1] = r+1;
                return ret;
            } else {
                l++;
            }
        }
        return ret;
    }
}

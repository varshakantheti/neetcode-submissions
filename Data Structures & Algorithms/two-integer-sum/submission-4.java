class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n= 0; n<nums.length; n++){
            if(map.containsKey(nums[n])){
                int [] ret = new int[2];
                ret[0] = map.get(nums[n]);
                ret[1] = n;
                return ret;
            }
            map.put(target-nums[n], n);
        }
        return null;
    }
}

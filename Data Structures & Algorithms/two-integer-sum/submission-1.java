class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i<=nums.length-1 ; i++){
            int temp = target - nums[i];
            if(myMap.containsKey(temp)){
                return new int[]{myMap.get(temp),i};
            } else {
                myMap.put(nums[i],i);
            }
        }
        return nums;
    }
}

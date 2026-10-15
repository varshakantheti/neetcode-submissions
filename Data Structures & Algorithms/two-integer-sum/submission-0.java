class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> store = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int pair = target - nums[i];
            if (store.containsKey(pair)){
                return new int[]{store.get(pair), i};
            } else {
                store.put(nums[i], i);
            }
        }
        return null;
    }
}

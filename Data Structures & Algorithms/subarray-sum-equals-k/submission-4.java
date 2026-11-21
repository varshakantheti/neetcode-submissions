class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sums = new HashMap<>();
        sums.put(0,1);
        int sum = 0;
        int output = 0;
        for(int num : nums){
            sum +=num;
            int remaining = sum - k;
            output += sums.getOrDefault(remaining,0);
            sums.put(sum, sums.getOrDefault(sum,0)+1);
        }
        return output;   
    }
}
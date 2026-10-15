class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int each : nums){
            if (seen.contains(each)){
                return true;
            }
            seen.add(each);
        }
        return false;
    }
}
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
        /*
        HashMap<Integer, Integer> tracker = new HashMap<>();
        for (int each : nums){
            if (tracker.containsKey(each)){
                return true;
            }
            tracker.put(each, 1);
        }
        return false;
        */
    }
}
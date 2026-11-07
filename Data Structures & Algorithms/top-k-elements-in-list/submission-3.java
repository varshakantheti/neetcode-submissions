class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //num, freq
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer>[] buckets = new ArrayList[nums.length+1];
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            } else {
                map.put(num,1);
            }
        }
        for(int i : map.keySet()){
            if(buckets[map.get(i)]==null){
                buckets[map.get(i)] = new ArrayList<>();
            }
            buckets[map.get(i)].add(i);
        }
        int[] ret = new int[k];
        for(int i = nums.length; i>=0; i--){
            if(buckets[i]==null){
                continue;
            }
            for(int j = 0; j<buckets[i].size(); j++){
                ret[k-1]=buckets[i].get(j);
                k--;
                if(k==0){
                    return ret;
                }
            }
        }
        return ret;
        
    }
}

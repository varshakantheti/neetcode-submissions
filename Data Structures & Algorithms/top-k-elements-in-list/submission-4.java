class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer>[] buckets = new ArrayList[nums.length+1];
        for(int key : map.keySet()){
            int val = map.get(key);
            if(buckets[val]==null){
                ArrayList<Integer> a = new ArrayList<>();
                buckets[val]=a;
            }
            buckets[val].add(key);
        }
        int[] ret = new int[k];
        for(int i = buckets.length-1; i>=0; i--){
            if(buckets[i]==null){
                continue;
            } else {
                for(int q = buckets[i].size()-1; q>=0; q--){
                    ret[k-1] = buckets[i].get(q);
                    k--;
                    if(k==0){
                        return ret;
                    }
                }
            }  
        }
        return ret;  
    }
}

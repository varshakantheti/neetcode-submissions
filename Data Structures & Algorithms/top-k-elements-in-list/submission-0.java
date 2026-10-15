class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        ArrayList<Integer>[] freqList = new ArrayList[nums.length+1];
        for(int num : nums){
            if(!myMap.containsKey(num)){
                myMap.put(num,1);
            } else{
                myMap.put(num, myMap.get(num)+1);
            }
        }
        for(int i : myMap.keySet()){
            if(freqList[myMap.get(i)]==null){
                freqList[myMap.get(i)] = new ArrayList<>();
            }
            freqList[myMap.get(i)].add(i);
        }
        int[] ret = new int[k];
        int m = 0;
        for(int i=freqList.length-1; i>=0; i--){
            if(freqList[i]!=null){
                for(int j : freqList[i]){
                    ret[m] = j;
                    m++;
                    if(m==(k)){
                        return ret;
                    }
                }
            }
        }
        return ret;
        
    }
}

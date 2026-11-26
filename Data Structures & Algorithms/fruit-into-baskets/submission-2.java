class Solution {
    public int totalFruit(int[] fruits) {
        //hashmap
        //fruit(num), index

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
        for(int i = 0; i<fruits.length; i++){
            if(map.isEmpty() || map.size()<2 || map.containsKey(fruits[i])){
                map.put(fruits[i],i);
                count++;
            } else {
                int index = Integer.MAX_VALUE;
                int remove = -1;
                for(int j : map.keySet()){
                    if(map.get(j)<index){
                        index = map.get(j);
                        remove = j;
                    }
                }
                map.remove(remove);
                map.put(fruits[i],i);
                count = i-index;
            }
            max = Math.max(max, count);
        }
        return max;
    
    }
}
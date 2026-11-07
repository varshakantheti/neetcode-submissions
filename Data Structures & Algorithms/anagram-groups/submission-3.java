class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(String str : strs){
            int[] counts = new int[26];
            for(char c : str.toCharArray()){
                counts[c-'a']++;
            }
            String keyy = Arrays.toString(counts);
            if(map.containsKey(keyy)){
                map.get(keyy).add(str);
            } else {
                ArrayList<String> myList = new ArrayList<>();
                myList.add(str);
                map.put(keyy, myList);
            }
        }
        return new ArrayList<>(map.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] temp = new int[26];
            for(char c : s.toCharArray()){
                temp[c-'a']++;
            }
            String k = Arrays.toString(temp);
            if(!map.containsKey(k)){
                ArrayList<String> li = new ArrayList<>();
                map.put(k, li);
            }
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

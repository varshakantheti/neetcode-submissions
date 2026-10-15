class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> myMap = new HashMap<>();
        for(String word : strs){
            char[] myAr = new char[26];
            for(char c : word.toCharArray()){
                myAr[c-'a']++;
            }
            String key = new String(myAr);
            if(!(myMap.containsKey(key))){
                myMap.put(key, new ArrayList<>());
            }
            myMap.get(key).add(word);
        }
        return new ArrayList<>(myMap.values());
    }
}

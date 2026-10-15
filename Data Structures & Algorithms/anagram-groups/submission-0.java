class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> myMap = new HashMap<>();
        for(String word : strs){
            char[] charCount = new char[26];
            for(char c : word.toCharArray()){
                charCount[c-'a']++;
            }
            String key = new String(charCount);
            if(!(myMap.containsKey(key))){
                myMap.put(key,new ArrayList<String>());
            }
            myMap.get(key).add(word);
        }
        return new ArrayList<>(myMap.values());
    }
}

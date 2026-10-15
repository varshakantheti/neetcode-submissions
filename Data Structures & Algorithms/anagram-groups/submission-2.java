class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,ArrayList<String>> myMap = new HashMap<>();
        for(String str : strs){
            char[] cArray = new char[26];
            for(char c : str.toCharArray()){
                cArray[c-'a']++;
            }
            String temp = new String(cArray);
            if(!myMap.containsKey(temp)){
                myMap.put(temp, new ArrayList<String>());
            }
            myMap.get(temp).add(str);
        }
        return new ArrayList(myMap.values());























        /*
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
        */
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        if(!(s.length() == t.length())){
            return false;
        }
        for(char each : s.toCharArray()){
            if(sMap.containsKey(each)){
                sMap.put(each, sMap.get(each)+1);
            } else{
                sMap.put(each, 1);
            }
        }
        for(char each : t.toCharArray()){
            if(tMap.containsKey(each)){
                tMap.put(each, tMap.get(each)+1);
            } else{
                tMap.put(each, 1);
            }
        }
        return (tMap.equals(sMap));
    }
}

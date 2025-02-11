class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> str = new HashMap<>();
        int windowStart=0, matched=0;
        for(int i=0; i<s1.length(); i++){
            str.put(s1.charAt(i), str.getOrDefault(s1.charAt(i), 0)+1);
        }
        for(int windowEnd=0; windowEnd<s2.length(); windowEnd++){
            char rc = s2.charAt(windowEnd);
            if(str.containsKey(rc)){
                str.put(rc, str.get(rc)-1);
                if(str.get(rc)==0){
                    matched++;
                }
            }
            if(matched==str.size()){
                return true;
            }
            if(windowEnd>=s1.length()-1){
                char lc = s2.charAt(windowStart);
                windowStart++;
                if(str.containsKey(lc)){
                    if(str.get(lc)==0){
                        matched--;
                    }
                    str.put(lc, str.get(lc)+1);
                }
            }
            
        }
        return false;
    }
}
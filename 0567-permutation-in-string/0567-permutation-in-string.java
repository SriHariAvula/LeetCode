class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> bucket = new HashMap<>();
        int matches=0, windowStart=0;
        boolean ans = false;
        for(int i=0; i<s1.length(); i++){
            bucket.put(s1.charAt(i), bucket.getOrDefault(s1.charAt(i), 0)+1);
        }
        for(int windowEnd=0; windowEnd<s2.length(); windowEnd++){
            char rc = s2.charAt(windowEnd);
            if(bucket.containsKey(rc)){
                bucket.put(rc, bucket.get(rc)-1);
                if(bucket.get(rc)==0){
                    matches++;
                }
            }
            if(matches==bucket.size()){
                return true;
            }
            if(windowEnd>=s1.length()-1){
                char lc = s2.charAt(windowStart);
                if(bucket.containsKey(lc)){
                    if(bucket.get(lc)==0){
                        matches--;
                    }
                    bucket.put(lc, bucket.get(lc)+1);
                }
                windowStart++;
            }
        }
        return ans;
    }
}
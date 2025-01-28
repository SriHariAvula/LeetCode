class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> longestSub = new HashMap<>();
        int windowStart = 0, maxLength=0, maxRepeatCharacter=0;
        for(int windowEnd=0; windowEnd<s.length(); windowEnd++){
            char rc = s.charAt(windowEnd);
            longestSub.put(rc, longestSub.getOrDefault(rc, 0)+1);
            maxRepeatCharacter = Math.max(maxRepeatCharacter, longestSub.get(rc));
            while(windowEnd-windowStart+1 - maxRepeatCharacter>k){
                char lc = s.charAt(windowStart);
                longestSub.put(lc, longestSub.get(lc)-1);
                if(longestSub.get(lc)==0){
                    longestSub.remove(lc);
                }
                windowStart++;
            }
            maxLength=Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }
}
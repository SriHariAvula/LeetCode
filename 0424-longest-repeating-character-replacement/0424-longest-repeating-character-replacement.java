class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> longestSub = new HashMap<>();
        int windowStart = 0, maxLength=0, maxRepeatCharacter=0;
        for(int i=0; i<s.length(); i++){
            char rc = s.charAt(i);
            longestSub.put(rc, longestSub.getOrDefault(rc, 0)+1);
            maxRepeatCharacter = Math.max(maxRepeatCharacter, longestSub.get(rc));
            if(i-windowStart+1 - maxRepeatCharacter>k){
                char lc = s.charAt(windowStart);
                longestSub.put(lc, longestSub.get(lc)-1);
                windowStart++;
            }
            maxLength=Math.max(maxLength, i-windowStart+1);
        }
        return maxLength;
    }
}
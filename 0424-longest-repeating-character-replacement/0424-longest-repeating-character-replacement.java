class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> basket = new HashMap<>();
        int maxCount=0, maxLength=0, windowStart=0;
        for(int windowEnd=0; windowEnd<s.length(); windowEnd++){
            char rc = s.charAt(windowEnd);
            basket.put(rc, basket.getOrDefault(rc, 0)+1);
            maxCount = Math.max(maxCount, basket.get(rc));
            if(windowEnd-windowStart+1-maxCount>k){
                char lc = s.charAt(windowStart);
                basket.put(lc, basket.get(lc)-1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }
}
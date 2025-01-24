class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> basket = new HashMap<>();
        int windowStart=0, maxFruit=0;
        for(int i=0; i<s.length(); i++){
            char rc = s.charAt(i);
            if(basket.containsKey(rc)){
                windowStart = Math.max(windowStart, basket.get(rc)+1);
            }
            basket.put(rc, i);
            maxFruit = Math.max(maxFruit, i-windowStart+1);
        }
        return maxFruit;
    }
}
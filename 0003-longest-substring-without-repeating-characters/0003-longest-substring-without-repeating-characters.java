class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> basket = new HashMap<>();
        int windowStart=0, maxLength=0;
        for(int windowEnd=0; windowEnd<s.length(); windowEnd++){
            char ch = s.charAt(windowEnd);
            basket.put(ch, basket.getOrDefault(ch, 0)+1);
            while(basket.size()<windowEnd-windowStart+1){
                char lch = s.charAt(windowStart);
                basket.put(lch, basket.get(lch)-1);
                if(basket.get(lch)==0){
                    basket.remove(lch);
                }
                windowStart++;
            }
            maxLength=Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }
}
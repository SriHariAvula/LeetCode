class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> basket = new HashMap<>();
        int windowStart=0, maxLength=0;
        for(int i=0; i<s.length(); i++){
            while(basket.containsKey(s.charAt(i))){
                basket.put(s.charAt(windowStart), basket.get(s.charAt(windowStart))-1);
                if(basket.get(s.charAt(windowStart))==0){
                    basket.remove(s.charAt(windowStart));
                }
                windowStart++;
            }
            basket.put(s.charAt(i), basket.getOrDefault(s.charAt(i), 0)+1);
            maxLength=Math.max(maxLength, i-windowStart+1);
        }
        return maxLength;
    }
}
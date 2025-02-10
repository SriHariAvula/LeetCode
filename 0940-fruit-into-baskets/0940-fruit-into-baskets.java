class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>();
        int windowStart=0, k=2, maxLength=0;
        for(int windowEnd=0; windowEnd<fruits.length; windowEnd++){
            basket.put(fruits[windowEnd], basket.getOrDefault(fruits[windowEnd],0)+1);
            while(basket.size()>2){
                basket.put(fruits[windowStart], basket.get(fruits[windowStart])-1);
                if(basket.get(fruits[windowStart])==0){
                    basket.remove(fruits[windowStart]);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }
}
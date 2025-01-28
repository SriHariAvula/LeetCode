class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer, Integer> basket = new HashMap<>();
        int maxLength=0, maxRepeat=0, windowStart=0;
        for(int windowEnd=0; windowEnd<nums.length; windowEnd++){
            int rc = nums[windowEnd];
            basket.put(rc, basket.getOrDefault(rc, 0)+1);
            maxRepeat = Math.max(maxRepeat, basket.getOrDefault(1,0));
            if(basket.getOrDefault(0, 0)>k){
                int lc = nums[windowStart];
                basket.put(lc, basket.get(lc)-1);
                windowStart++;
            }
            maxLength=Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }
}
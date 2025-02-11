class Solution {
    public int longestOnes(int[] nums, int k) {
        HashMap<Integer, Integer> ones = new HashMap<>();
        int maxLength = 0, maxCount = 0, windowStart=0, number=1;
        for(int windowEnd=0; windowEnd<nums.length; windowEnd++){
            ones.put(nums[windowEnd], ones.getOrDefault(nums[windowEnd], 0)+1);
            maxCount = ones.getOrDefault(number, 0);
            if(windowEnd-windowStart+1-maxCount>k){
                ones.put(nums[windowStart], ones.get(nums[windowStart])-1);
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }
}
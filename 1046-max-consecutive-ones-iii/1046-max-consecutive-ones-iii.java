class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLength = 0, maxCount = 0, windowStart=0, number=1;
        for(int windowEnd=0; windowEnd<nums.length; windowEnd++){
            if(nums[windowEnd]==1){
                maxCount++;
            }
           
            if(windowEnd-windowStart+1-maxCount>k){
                if(nums[windowStart]==1){
                    maxCount--;
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd-windowStart+1);
        }
        return maxLength;
    }
}
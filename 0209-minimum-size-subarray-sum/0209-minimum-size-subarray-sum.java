class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength=Integer.MAX_VALUE, windowStart=0, curSum=0;
        for(int windowEnd=0; windowEnd<nums.length; windowEnd++){
            curSum=curSum+nums[windowEnd];
            while(curSum>=target){
                minLength = Math.min(windowEnd-windowStart+1, minLength);
                curSum=curSum-nums[windowStart];
                windowStart++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int curSum=0, windowStart=0, maxSum=nums[0];
        for(int windowEnd=0; windowEnd<nums.length; windowEnd++){
            if(curSum<0){
                curSum=0;
            }
            curSum = curSum+nums[windowEnd];
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
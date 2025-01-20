class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int windowStart = 0, minLength = Integer.MAX_VALUE;
        for(int end = 0; end<nums.length; end++){
            sum = sum + nums[end];
            while(sum>=target){
                minLength = Math.min(minLength, end - windowStart + 1);
                sum = sum - nums[windowStart];
                windowStart++;
            }
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}
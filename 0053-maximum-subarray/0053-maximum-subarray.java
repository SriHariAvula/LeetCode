class Solution {
    public int maxSubArray(int[] nums) {
        int curSum = 0, sum = nums[0];
        for(int i=0; i<nums.length; i++){
            if(curSum<0){
                curSum = 0;
            }
            curSum = curSum + nums[i];
            sum = Math.max(sum, curSum);
        }
        return sum;
    }
}
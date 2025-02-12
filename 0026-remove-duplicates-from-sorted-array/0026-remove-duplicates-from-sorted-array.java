class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right =0;
        for(int i=0; i<nums.length; i++){
            if(nums[left]!=nums[right]){
                left++;
                nums[left]=nums[right];
                right++;
            } else {
                right++;
            }
        }
        return left+1;
    }
}
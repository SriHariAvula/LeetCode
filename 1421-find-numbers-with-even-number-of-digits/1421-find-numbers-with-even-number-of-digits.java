class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            String each = String.valueOf(nums[i]);
            if(each.length()%2==0){
                count++;
            }
        }
        return count;
    }
}
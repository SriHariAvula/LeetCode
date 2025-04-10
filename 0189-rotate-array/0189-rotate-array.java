class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int left=0, right=nums.length-1;
        while(left<=right){
            int num =  nums[left];
            nums[left] = nums[right];
            nums[right]=num;
            left++;
            right--;
        }

        left=0;
        right=k-1;
        while(left<=right){
            int num =  nums[left];
            nums[left] = nums[right];
            nums[right]=num;
            left++;
            right--;
        }

        left=k;
        right=nums.length-1;
        while(left<=right){
            int num =  nums[left];
            nums[left] = nums[right];
            nums[right]=num;
            left++;
            right--;
        }
    }
}
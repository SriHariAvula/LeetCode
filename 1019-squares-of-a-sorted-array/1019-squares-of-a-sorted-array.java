class Solution {
    public int[] sortedSquares(int[] nums) {
        int left =0, right = nums.length-1;
        int[] arr = new int[nums.length];
        for(int i=nums.length-1; i>=0; i--){
            int l = nums[left]*nums[left];
            int r = nums[right]*nums[right];
            if(l>=r){
                arr[i]=l;
                left++;
            } else {
                arr[i] = r;
                right--;
            }
        }
        return arr;
    }
}
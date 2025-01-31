class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            int y = target - nums[i];
            if(arr.containsKey(y)){
                return new int[]{i, arr.get(y)};
            }
            arr.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            arr.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int curValue = target - nums[i];
            if(arr.containsKey(curValue)&&arr.get(curValue)!=i){
                return new int[]{i, arr.get(curValue)};
            }
        }
        return new int[]{-1, -1};
    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> arr = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            arr.put(nums[i], arr.getOrDefault(nums[i], 0)+1);
            if(arr.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
}
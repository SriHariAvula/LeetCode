class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 0
        for r in range(0, len(nums)):
            if nums[l] == nums[r]:
                continue
            else:
                nums[l+1] = nums[r]
                l = l+1;
        return l+1
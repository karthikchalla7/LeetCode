class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        
        n = len(nums)
        great = False
        less = False
        for i in range(n-1):
            if (nums[i]<nums[i+1]):
                less = True
            if (nums[i]>nums[i+1]):
                great = True
            if great and less:
                return False
        return True
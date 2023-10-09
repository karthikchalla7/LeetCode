class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        first = -1
        for i in range(len(nums)):
            if(nums[i]==target):
                first = i
                break
        second =-1
        for i in range(len(nums)-1,-1,-1):
            if(nums[i]==target ):
                second = i
                break
        return [first,second]
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        count = 0
        start = 0
        for num in nums:
            if num!=val:
                nums[start]=num
                count+=1
                start+=1
        return count
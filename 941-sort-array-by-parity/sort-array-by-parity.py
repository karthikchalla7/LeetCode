class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:

        arr = []
        n = len(nums)
        for i in range(n):
            if nums[i]%2==0:
                arr.append(nums[i])
        for i in range(n):
            if nums[i]%2!=0:
                arr.append(nums[i])
        return arr
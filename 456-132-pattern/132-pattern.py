class Solution:
    def find132pattern(self, nums: List[int]) -> bool:

        # # brute force apporach

        # n = len(nums)
        # for i in range(n):
        #     for j in range(i+1,n):
        #         for k in range(j+1,n):
        #             if nums[i]<nums[k]<nums[j]:
        #                 return True
        # return False

        stack = []
        third = float('-inf')

        for num in nums[::-1]:
            if num < third:
                return True
            while stack and num>stack[-1]:
                third = stack.pop()
            stack.append(num)
        return False
        
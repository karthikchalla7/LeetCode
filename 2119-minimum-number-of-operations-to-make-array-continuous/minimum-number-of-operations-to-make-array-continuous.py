class Solution:
    def minOperations(self, nums: List[int]) -> int:
        n = len(nums)
        minops = n
        right = 0
        unique = sorted(set(nums))
        for left in range(len(unique)):
            while right<len(unique) and unique[right]<unique[left]+n:
                right+=1
            minops = min(minops,n-(right-left))
        return minops
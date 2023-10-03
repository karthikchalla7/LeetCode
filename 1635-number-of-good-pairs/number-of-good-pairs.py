class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        #brute force
        pairs =0
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if (i<j and nums[i]==nums[j]):
                    pairs+=1
        return pairs
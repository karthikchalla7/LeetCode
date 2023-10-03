class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        # #brute force
        # pairs =0
        # for i in range(len(nums)):
        #     for j in range(i+1,len(nums)):
        #         if (i<j and nums[i]==nums[j]):
        #             pairs+=1
        # return pairs

        #one pass
        store = {}
        pairs = 0
        for num in nums:
            if num in store:
                pairs+=store[num]
                store[num]+=1
            else:
                store[num]=1
        return pairs
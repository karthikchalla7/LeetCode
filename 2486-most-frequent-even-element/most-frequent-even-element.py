class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        res = [0]*1000001
        for num in nums:
            if num%2==0:
                res[num]+=1
        maxval = max(res)
        if maxval!=0:
            return  res.index(maxval)
        return -1
        

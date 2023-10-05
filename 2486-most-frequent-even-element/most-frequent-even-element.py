class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        map = {}
        for num in nums:
            if num%2==0:
                if num in map:
                    map[num]+=1
                else:
                    map[num]=1
        maxele = 0
        maxidx = -1
        for i in map.keys():
            if map[i]>maxele:
                maxele=map[i]
                maxidx= i
            if map[i]==maxele and i<maxidx:
                maxidx=i
        return maxidx
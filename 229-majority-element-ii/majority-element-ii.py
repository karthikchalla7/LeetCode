class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        res = []
        map = {}
        appear = len(nums)//3
        for num in nums:
            if num in map:
                map[num]+=1
            else:
                map[num]=1
        for entry in map.items():
            if(entry[1]>appear):
                ele = entry[0]
                res.append(ele)
        return res
class Solution:
    def fullBloomFlowers(self, flowers: List[List[int]], people: List[int]) -> List[int]:
        flower_count = defaultdict(int)

        for start,end in flowers:
            flower_count[start]+=1
            flower_count[end+1]-=1
        
        days = sorted(flower_count.keys())

        tf = 0
        for day in days:
            tf+=flower_count[day]
            flower_count[day] = tf
        
        res = []
        for time in people:
            idx = bisect_right(days,time)
            if idx==0:
                res.append(0)
            else:
                res.append(flower_count[days[idx-1]])
        return res
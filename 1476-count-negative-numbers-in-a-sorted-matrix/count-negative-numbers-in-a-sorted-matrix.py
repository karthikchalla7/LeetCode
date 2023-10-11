class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        arr = []
        for row in grid:
            for ele in row:
                arr.append(ele)
        count = 0
        for num in arr:
            if num<0:
                count+=1
        return count
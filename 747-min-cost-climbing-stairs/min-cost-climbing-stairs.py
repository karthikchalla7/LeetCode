class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        arr = [0]*len(cost)
        n = len(cost)
        arr[0] = cost[0]
        if n>=2:
            arr[1] = cost[1]

        for i in range(2,n):
            arr[i] = cost[i] +min(arr[i-1],arr[i-2])
        return min(arr[-1],arr[-2]) 
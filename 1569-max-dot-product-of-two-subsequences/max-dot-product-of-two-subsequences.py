class Solution:
    def maxDotProduct(self, nums1: List[int], nums2: List[int]) -> int:
        n = len(nums1)
        m = len(nums2)
        
        arr = [[-10**10 for _ in range(m+1)]for _ in range(n+1)]
        for i in range(1,n+1):
            for j in range(1,m+1):
                arr[i][j] = max(nums1[i-1]*nums2[j-1],arr[i-1][j-1]+nums1[i-1]*nums2[j-1],arr[i-1][j],arr[i][j-1])
        return arr[n][m]
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        
        arr = []
        ans = 1
        arr.append(ans)
        for i in range(1,rowIndex+1):
            ans = ans*(rowIndex+1-i)
            ans = ans//i
            arr.append(ans)
        return arr
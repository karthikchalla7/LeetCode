class Solution:
    def isPalindrome(self, x: int) -> bool:
        dup = x
        res = 0
        while x>0:
            res=res*10+x%10
            x//=10
        return res==dup
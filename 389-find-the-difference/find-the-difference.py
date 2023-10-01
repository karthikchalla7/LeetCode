class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        char = 0
        for c in s+t:
            char^=ord(c)
        return chr(char)
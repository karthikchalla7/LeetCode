class Solution:
    def reverseWords(self, s: str) -> str:
        arr = s.split()
        n = len(arr)
        for i in range(n//2):
            temp = arr[i]
            arr[i]=arr[n-i-1]
            arr[n-i-1]=temp
        return " ".join(arr)

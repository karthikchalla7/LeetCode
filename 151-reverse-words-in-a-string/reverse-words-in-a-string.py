class Solution:
    def reverseWords(self, s: str) -> str:
        arr = s.split()
        start = 0
        end = len(arr)-1
        while(start<=end):
            temp = arr[start]
            arr[start]=arr[end]
            arr[end]=temp
            start+=1
            end-=1
        return " ".join(arr)

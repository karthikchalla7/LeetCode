class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        
        def findfirst(nums,target):
            first = -1
            left = 0
            right = len(nums)-1
            while(left<=right):
                mid = left+(right-left)//2
                if(nums[mid]==target):
                    first = mid
                    right = mid-1
                elif nums[mid]<target:
                    left = mid+1
                else:
                    right=mid-1
            return first

        def findsecond(nums,target):
            second = -1
            left = 0
            right = len(nums)-1
            while(left<=right):
                mid = (right-left)//2 + left
                if(nums[mid]==target):
                    second = mid
                    left = mid+1
                elif nums[mid]<target:
                    left = mid+1
                else:
                    right=mid-1
            return second

        firstele = findfirst(nums,target)
        secondele = findsecond(nums,target)
        return [firstele,secondele]
                

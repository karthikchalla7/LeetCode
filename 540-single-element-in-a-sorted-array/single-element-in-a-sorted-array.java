class Solution {
    public int singleNonDuplicate(int[] nums) {
        //using binary search
        //according to the pattern if the numbers appearing exaclty twice 
        //so the pattern goes like this [evenindex,oddindex] but if a single is their then it disrupts the pattern

        int left =0;
        int right = nums.length-1;
    
        while(left<right){
            int mid = left+(right-left)/2;
            
            //since paring starts with evenindex from observation.
            if(mid%2==1) mid--;

            //since the pair is correct we move ahead of the pair
            if(nums[mid]==nums[mid+1]) left = mid+2;
            else right = mid;
        }

        
        return nums[left];

    }
}
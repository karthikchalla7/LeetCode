class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = false;
        boolean dec = false;
        int n = nums.length;
        for(int i=0;i<n-1;i++){

            if(nums[i]>nums[i+1]) inc = true;
            if(nums[i]<nums[i+1]) dec = true;
            if(inc && dec) return false;

        }
        return true;
    }
}
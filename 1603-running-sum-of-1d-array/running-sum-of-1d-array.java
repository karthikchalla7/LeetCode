class Solution {
    public int[] runningSum(int[] nums) {
        
        int newFirst =nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            int preSum = newFirst + nums[i];
            nums[i] = preSum;
            newFirst = preSum;
        }
        return nums;

    }
}
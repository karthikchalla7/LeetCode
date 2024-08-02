class Solution {
    public int minSwaps(int[] nums) {

        //count total number of one
        int totalOnes = 0;
        for(int num:nums){
            totalOnes+=num;
        }
        
        //if there are no 1's or full of 1's then we  will return 0
        if(totalOnes ==0 || totalOnes == nums.length){
            return 0;
        }

        //sliding window of length total ones we have to group
        int n = nums.length;
        int maxOnesInWindow = 0;
        int currentones = 0;

        
        //since it is a circular array we have to append the original with itself
        int[] extendednums = new int[n*2];
        for(int i=0;i<n;i++){
            extendednums[i] = nums[i];
            extendednums[i+n] = nums[i];
        }

        //initial window
        for(int i=0;i<totalOnes ;i++){
            currentones += extendednums[i];
        }

        maxOnesInWindow = currentones;

        for(int i=1;i<=n;i++){
            //remove the first element of the last window
            currentones-=extendednums[i-1];
            //add the last element of the current window.
            currentones+=extendednums[i+totalOnes-1]; 
            maxOnesInWindow = Math.max(maxOnesInWindow,currentones);
        }

        return totalOnes - maxOnesInWindow;

        
    }
}
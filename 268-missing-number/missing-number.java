class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] present = new int[n+1];
        for(int num:nums){
            present[num]=1;
        }
        for(int i=0;i<n+1;i++){
            if(present[i]==0) return i;
        }
        return -1;
    }
}
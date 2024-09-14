class Solution {
    public int longestSubarray(int[] nums) {
        int maxele = Integer.MIN_VALUE;
        for(int num:nums) maxele = Math.max(maxele,num);

        int size =0;
        int  res = 0;
        for(int num:nums){
            if(num==maxele) size+=1;
            else size =0;
            res = Math.max(res,size);
        }
        return res;
    }
}
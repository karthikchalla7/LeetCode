class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {

        int len = (n*(n+1))/2;
        int[] arr = new int[len];
        int k =0;
        for(int i=0;i<n;i++){
            
            int presum = nums[i];
            arr[k++] = nums[i];
            for(int j=i+1;j<n;j++){
                int sum = (presum+nums[j])%1000000007;
                presum = sum;
                arr[k++]= sum;
            }
        }
        Arrays.sort(arr);
        long totalsum = 0;
        for(int i=left-1;i<right;i++){
            totalsum=(totalsum+arr[i])%1000000007;
        }
        return (int)totalsum;

        
    }
}
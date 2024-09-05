class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int arrsum = 0;
        for(int num:rolls) arrsum+=num;
        int m = rolls.length;
        int totalsum = mean * (n+m);
        int missingSum = totalsum - arrsum;
        
        if(missingSum >6*n || missingSum<n) return new int[0];
        
        int[] res = new int[n];
        int k =0;
        while(n!=0){
            int val = Math.min(6,missingSum-n+1);
            res[k++] = val;
            missingSum-=val;
            n-=1;
        }
        return res;
    }
}
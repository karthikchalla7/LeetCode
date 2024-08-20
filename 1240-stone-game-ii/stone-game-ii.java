class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n+1][n+1];

        int[] suffix = new int[n+1];
        //calculate suffix sums
        for(int i=n-1;i>=0;i--){
            suffix[i] = suffix[i+1]+piles[i];
        }

        for(int i=n-1;i>=0;--i){
            for(int m=1;m<=n;++m){
                for(int x=1;x<=2*m && i+x<=n;++x){
                    dp[i][m] = Math.max(dp[i][m],suffix[i]-dp[i+x][Math.max(m,x)]);
                }
            }
        }
        return dp[0][1];
    }
}
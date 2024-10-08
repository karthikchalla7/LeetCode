class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int n = queries.length;
        int[] res = new int[n];

        for(int i=0;i<n;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int val =0;
            for(int j=start;j<=end;j++){
                val ^= arr[j];
            }
            res[i]=val;
        }
        return res;
    }
}
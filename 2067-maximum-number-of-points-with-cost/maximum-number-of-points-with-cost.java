class Solution {
    public long maxPoints(int[][] points) {
        
        int rows = points.length;
        int cols = points[0].length;

        //frist row values
        long[] prevrow = new long[cols];
        for(int j=0;j<cols;j++){
        prevrow[j] = points[0][j];
        }

        for(int i=1;i<rows;i++){
            long[] left = new long[cols];
            long[] right = new long[cols];

            left[0] = prevrow[0];
            for(int j=1;j<cols;j++){
                left[j] = Math.max(left[j-1]-1,prevrow[j]);
            }
            // System.out.println(Arrays.toString(left));
            right[cols-1] = prevrow[cols-1];
            for(int j=cols-2;j>=0;j--){
                right[j] = Math.max(right[j+1]-1,prevrow[j]);
            }
            // System.out.println(Arrays.toString(right));
            for(int j=0;j<cols;j++){
                prevrow[j] =points[i][j]+ Math.max(left[j],right[j]);
            }
            // System.out.println(Arrays.toString(prevrow));


        }
        long maxpoints = 0;
        for(long point:prevrow){
            maxpoints = Math.max(maxpoints,point);
        }
        return maxpoints;
    }
}
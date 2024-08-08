class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> arr = new ArrayList<>();
        if(matrix.length==0||matrix[0].length==0) return arr;

        int rowbeign = 0;
        int rowend = matrix.length-1;
        int colbeign = 0;
        int colend = matrix[0].length-1;

        //codition to travese:
        while(rowbeign<=rowend && colbeign<=colend){

            //traverse from left to right
            for(int i=colbeign;i<=colend;i++){
                arr.add(matrix[rowbeign][i]);
            }
            rowbeign++;

            //traverse from up to donw.
            for(int i=rowbeign;i<=rowend;i++){
                arr.add(matrix[i][colend]);
            }
            colend--;
            
            //traverse from right to left.
            if(rowbeign<=rowend){
                for(int i=colend;i>=colbeign;i--){
                    arr.add(matrix[rowend][i]);
                }
            }
            rowend--;

            //traverse donw to up
            if(colbeign<=colend){
                for(int i=rowend;i>=rowbeign;i--){
                    arr.add(matrix[i][colbeign]);
                }
            }
            colbeign++;

        }
        return arr;

    }
}
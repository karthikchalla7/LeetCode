class Solution {
    public int magic(int[][]grid,int rows, int cols){
        
        //check if its in range 1-9
        Set<Integer> set = new HashSet<>();
        for(int r=rows;r<rows+3;r++ ){
            for(int c=cols;c<cols+3;c++){
                if(!set.add(grid[r][c]) || grid[r][c]<1 || grid[r][c]>9)
                return 0;    
            }
            
        }

        //rows sum
        for(int r = rows;r<rows+3;r++){
            int sum=0;
            for(int c=cols;c<cols+3;c++){
                sum+=grid[r][c];
            }
            if(sum!=15){
                return 0;
            }
        }

        //cols sum
        
        for(int c=cols;c<cols+3;c++){
            int sum=0;
            for(int r = rows;r<rows+3;r++){
                sum+=grid[r][c];
            }
            if(sum!=15){
                return 0;
            }
        }

        //diagoanlsum
        if((grid[rows][cols]+grid[rows+1][cols+1]+grid[rows+2][cols+2] != 15)||(grid[rows][cols+2]+grid[rows+1][cols+1]+grid[rows+2][cols]!=15) ){
            return 0;
        }

        
        return 1;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int res=0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i=0;i<=rows-3;i++){
            for(int j=0;j<=cols-3;j++){
                res+=magic(grid,i,j);
            }
        }    
        return res;
    }
}
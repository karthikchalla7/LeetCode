class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        //reduce k value to one cycle of chalk
        long totalchalk = 0;
        for(int c:chalk){
            totalchalk+=c;
        }
        k%=totalchalk;
        for(int i=0;i<chalk.length;i++){
            if(k<chalk[i]) return i;
            k-=chalk[i];
        }
        return 0;
    }
}
class Solution {
    public int reverse(int x) {
        
        long rev = 0;
        while(x!=0){
            long rem = x%10;
            rev = rem+rev*10;
            x/=10;
        }
        //importatn part in this question are constraints
        if(rev<=Math.pow(-2,31) || rev>=Math.pow(2,31) ) return 0;
        return (int) rev;
    }
}
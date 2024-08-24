class Solution {

    private long palinfromleft(long left,boolean iseven){

        long palin = left;
        if(!iseven) left/=10;
        while(left>0){
            palin = palin*10 + left%10;
            left/=10;
        }
        return palin;
    }


    public String nearestPalindromic(String n) {
        long num = Long.parseLong(n);
        if(num<=10) return String.valueOf(num-1);
        if(num==1) return "9";

        int len = n.length();
        long lefthalf = Long.parseLong(n.substring(0,(len+1)/2));
        long[] palindromes = new long[5];
        palindromes[0] = palinfromleft(lefthalf-1,len%2==0);
        palindromes[1] = palinfromleft(lefthalf,len%2==0);
        palindromes[2] = palinfromleft(lefthalf+1,len%2==0);
        palindromes[3] = (long)Math.pow(10,len-1)-1;
        palindromes[4] = (long) Math.pow(10,len)+1;

        long nearest =0;
        long mindiff = Long.MAX_VALUE;
        for(long palin:palindromes){
            if(palin==num) continue;
            long diff = Math.abs(palin-num);
            if(diff<mindiff || ((diff==mindiff) && (palin<nearest))){
                mindiff = diff;
                nearest = palin;
            }
        }
        return String.valueOf(nearest);
    }
}
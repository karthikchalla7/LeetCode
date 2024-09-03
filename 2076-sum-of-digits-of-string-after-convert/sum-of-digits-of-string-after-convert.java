class Solution {
    private long count(long num){
        long res =0;
        while(num>0){
            res += (num%10);
            num/=10;
        }
        return res;
    }
    public int getLucky(String s, int k) {
        
        long sum = 0;
        for(char c :s.toCharArray()){
            int val = c-'a'+1;
            sum +=val%10 + val/10;
        }
        while(k-->1){
            sum = count(sum);
        }
        return (int)sum;
    }
}
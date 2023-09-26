class Solution {
    public int reverse(int x) {
        long res = 0;
        while(x!=0){
            int rem = x%10;
            res=rem+res*10;
            x/=10;
        }
        if(res<Math.pow(-2,31)|| res>Math.pow(2,31)) return 0;
        return (int)res;
    }
}
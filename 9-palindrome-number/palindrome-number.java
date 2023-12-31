class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int res = 0;
        int dup = x;
        while(dup!=0){
            int rem = dup%10;
            res = res*10 + rem;
            dup/=10;
        }
        if(res==x) return true;
        return false;
    }
}
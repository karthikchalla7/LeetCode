class Solution {
    public int tribonacci(int n) {

        if(n<=1) return n;
        if(n==2) return 1;
        int first = 0;
        int second = 1;
        int third = 1;
        int next = 0;
        for(int i=3;i<=n;i++){
            next = first + second+third;
            first = second;
            second = third;
            third = next;
        }
        return next;

    }
}
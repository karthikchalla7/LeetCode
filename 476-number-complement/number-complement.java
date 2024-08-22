class Solution {
    public int findComplement(int num) {
        
        String str = "";
        while(num>0){
            if((num&1)==0){
                str+='1';
            }
            else{
                str+='0';
            }
            num>>=1; // n/=2;
        }
        StringBuilder temp = new StringBuilder(str);
        String st = temp.reverse().toString();
        int res = Integer.parseInt(st,2);
        return res;

    }
}
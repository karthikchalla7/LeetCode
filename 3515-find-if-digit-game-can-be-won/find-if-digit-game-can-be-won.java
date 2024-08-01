class Solution {
    public boolean canAliceWin(int[] nums) {

        int alice = 0;
        int bob = 0;
        int alicedouble = 0;
        int bobdouble = 0;
        for(int num:nums){
            if(num>=1 && num<10) alice+=num;
            else bob+=num;
        }
        for(int num:nums){
            if(num>=10 && num<=99) alicedouble+=num;
            else bobdouble+=num;
        }
        if(alice>bob || alicedouble>bobdouble) return true;
        return false;

        
    }
}
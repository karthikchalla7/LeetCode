class Solution {
    public int singleNonDuplicate(int[] nums) {
        // we can use bit manipulation 
        //naive approach but the problem demands o(logn)-binary search approach
        int number = 0;
        for(int num:nums) number^=num;
        return number;   
    }
}
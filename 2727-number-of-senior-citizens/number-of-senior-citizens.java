class Solution {
    public int countSeniors(String[] details) {
        //optimized method using character - '0' we get int value
        int count = 0;
        for(String detail:details){
            int tens = detail.charAt(11)-'0';
            int ones = detail.charAt(12)-'0';
            int age = tens*10+ones;
            if(age>60) count++;
        }
        return count;
    }
}
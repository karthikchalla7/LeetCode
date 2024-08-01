class Solution {
    
    public int ageStr(String str){
        String age = str.substring(11,13);
        return Integer.parseInt(age);
    }
    public int countSeniors(String[] details) {
        int count =0;
        
        for(String detail:details){
            int age = ageStr(detail);
            if(age>60)count++;
        }

        return count;
    }
}
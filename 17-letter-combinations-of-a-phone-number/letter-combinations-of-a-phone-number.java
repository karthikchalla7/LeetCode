class Solution {
    public List<String> letterCombinations(String digits) {
        
        Map<Character,String> PHONE = new HashMap<>();
        PHONE.put('2',"abc");
        PHONE.put('3',"def");
        PHONE.put('4',"ghi");
        PHONE.put('5',"jkl");
        PHONE.put('6',"mno");
        PHONE.put('7',"pqrs");
        PHONE.put('8',"tuv");
        PHONE.put('9',"wxyz");

        List<String> res = new ArrayList<>();
        if(digits.isEmpty() || digits==null){
            return res;
        }

        res.add("");

        for(char digit:digits.toCharArray()){
            String letters = PHONE.get(digit);
            if(letters==null) return res;

            List<String> temp = new ArrayList<>();
            for(String combination:res){
                for(char letter:letters.toCharArray()){
                    temp.add(combination+letter);
                }
            }
            res=temp;
        }
        return res;
    }
}
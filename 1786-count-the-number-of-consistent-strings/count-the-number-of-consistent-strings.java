class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int bit_mask = 0;
        for(Character c :allowed.toCharArray()){
            int bit = 1<<(c-'a');
            bit_mask = bit_mask|bit;
        }
        int res = words.length;
        for(String word:words){
            for(Character c:word.toCharArray()){
                int bit = 1<<(c-'a');
                if((bit & bit_mask) == 0){
                    res-=1;
                    break;
                }
            }
        }
        return res;
    }
}
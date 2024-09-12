class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(Character s:allowed.toCharArray()){
            set.add(s);
        }
        int res = words.length;

        for(String word:words){
            for(Character c:word.toCharArray()){
                if(!set.contains(c)){
                    res-=1;
                    break;
                }
            }
        }
        return res;
    }
}
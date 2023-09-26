class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<>();
        int[] count = new int[26];
        boolean[] instack = new boolean[26];
        for (char c:s.toCharArray()){
            count[c-'a']++;
        }

        for(char c:s.toCharArray()){
            count[c-'a']--;
            if(instack[c-'a']) continue;
            
            while(!st.isEmpty() && c<st.peek() && count[st.peek()-'a']>0){
                instack[st.pop()-'a'] = false;
            }
            st.push(c);
            instack[c-'a']=true;
        }
        StringBuilder str = new StringBuilder();
        for(char c:st){
            str.append(c);
        }
        return str.toString();
    }
}
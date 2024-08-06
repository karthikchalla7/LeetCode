class Solution {
    public int minimumPushes(String word) {

        char[] arr = word.toCharArray();
        Arrays.sort(arr);

        String keys = "23456789";

        int total = 0;
        int keyidx = 0;
        int pushkey =1;
        for(char c:arr){
            total+=pushkey;
            keyidx++;
            if(keyidx==keys.length()){
                keyidx = 0;
                pushkey+=1;
            }
        }
        return total;

        
    }
}
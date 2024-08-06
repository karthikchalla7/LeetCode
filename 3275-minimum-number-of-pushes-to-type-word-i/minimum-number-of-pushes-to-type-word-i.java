class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int push = 0;
        for(int i=0;i<n;i++){
            if(i<8){
                push+=1;
            }
            else if(i<16){
                push+=2;
            }
            else if(i<24){
                push+=3;
            }
            else{
                push+=4;
            }
        }
        return push;
    }
}
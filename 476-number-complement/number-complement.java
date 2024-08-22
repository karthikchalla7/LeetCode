class Solution {
    public int findComplement(int num) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        while(num>0){
            arr.add(num%2);
            num>>=1;
        }

        int base = 1;
        int new_num = 0;
        for(int i=0;i<arr.size();i++){
            arr.set(i,arr.get(i)^1);
            new_num+=base*arr.get(i);
            base*=2;
        }
        return new_num;
    }
}
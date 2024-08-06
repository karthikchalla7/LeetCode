class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for(char c:word.toCharArray()){
            arr[c-'a']++;
        }

        Integer[] sorted = new Integer[26];
        for(int i=0;i<26;i++){
            sorted[i]=arr[i];
        }
        Arrays.sort(sorted,Collections.reverseOrder());
        System.out.println(Arrays.toString(sorted));
        int total =0;
        for(int i=0;i<26;i++){
             if(sorted[i]==0)break;
             total+=sorted[i] *(1+i/8);
             System.out.println(sorted[i]*(1+i/8));
        }
        return total;
    }
}
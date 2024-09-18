class Solution {
    
    public String largestNumber(int[] nums) {

        if(nums.length==0) return "";
        String[] str = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]  =String.valueOf(nums[i]);      
        }

        Comparator<String> comparator = new Comparator<String>(){
            public int compare(String s1,String s2){
                String str1=s1+s2;
                String str2=s2+s1;
                return str2.compareTo(str1);
            }
        };
        Arrays.sort(str,comparator);
        if(str[0].charAt(0)=='0') return "0";
        String res = "";
        for(String s:str){
            res+=s;
        }
        return res;
    }
}
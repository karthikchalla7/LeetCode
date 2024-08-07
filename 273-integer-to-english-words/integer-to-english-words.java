class Solution {
    private static final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String threeDigitToWord(int num){
        if(num==0) return "";
        else if(num<20) return belowTwenty[num]+" ";
        else if(num<100) return tens[num/10] +" "+threeDigitToWord(num%10);
        else return belowTwenty[num/100] +" Hundred "+threeDigitToWord(num%100);
    }
    
    //the logic would be dividiong the large number into three three digits 123,456 like this 
    //using modulo we comes from right to left three digits in the num
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        String words = "";
        int i=0;
        while(num>0){
            if(num%1000!=0){
                words = threeDigitToWord(num%1000)+thousands[i]+" "+words;
            }
            num/=1000;
            i++;
        }
        return words.trim();

    }
}
class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public String fractionAddition(String expression) {
        
        int numersum = 0,densum=1,i=0,n=expression.length();
        
        while(i<n){

            int sign =1;
            //sign
            if(expression.charAt(i)=='-'||expression.charAt(i)=='+'){
                sign = expression.charAt(i)=='-'?-1:1;
                i++;
            }

            //numerator 
            int numerator =0;
            while(i<n && Character.isDigit(expression.charAt(i))){
                numerator = numerator*10 + (expression.charAt(i)-'0');
                i++;
            }

            numerator*=sign;
            i++; //skip the symbol

            //denaminator
            int denaminator = 0;
            while(i<n && Character.isDigit(expression.charAt(i))){
                denaminator = denaminator*10 + (expression.charAt(i)-'0');
                i++;
            }

            numersum = numersum*denaminator + numerator*densum;
            densum*=denaminator;

            int div = gcd(Math.abs(numersum),densum);
            numersum/=div;
            densum/=div;
    
        }
        return numersum +"/"+densum;
    }
}
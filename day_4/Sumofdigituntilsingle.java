 class Sumofdigituntilsingle {public
    public static void main(String[] args) {
        int n=45673;
        int sum=sumofDigit(n);
        while(sum>9){
            sum=sumofDigit(sum);
        }
        System.out.println(sum);
        
         }
         public static int sumofDigit(int n){
            int sum=0;
            while(n!=0){
                int rem=n%10;
                sum+=rem;
                n=n/10;
            }
            return sum;
         }
    
}

import java.util.*;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=get.nextInt();
        int rem=0;
        int sum=0;
        while(n!=0){
             rem=n%10;
             sum=sum*10+rem;
             n=n/10;
        }
        System.out.println(sum);
        
    }

    
}

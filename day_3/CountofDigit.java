import java.util.*;
public class CountofDigit {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=get.nextInt();
        int count=0;
        while (n!=0) {
            int rem=n%10;
            count++;
             n=n/10;

                
            }
            System.out.println(count);
            
        }
        
    }
    


import java.util.Scanner;
public class Fizbaz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teh value of N:");
        int N=sc.nextInt();
        if(N%3==0 && N%5==0){
            System.out.println("Fizbaz:"+N);
        }
        
        else if(N%3==0){
            System.out.println("Fiz:"+N);
        }
        else if(N%5==0){
            System.out.println("baz:"+N);

        }
        else if(N%3!=0 && N%5!=0){
            System.out.println("The no not divided by 3 and 5:"+N);
        }
        
        

        }
    

        }
    
    


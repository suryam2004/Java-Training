import java.util.*;
public class Facters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i+"");
            }
        }

        
    }

    
}

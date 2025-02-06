import java.util.*;
public class Findsqureroot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();

        int div=2;
        while(div<=n/2){
            if(n/div==div){      //16/2==8,16/3==5,16/4==4
            System.out.println("The squre root of a number is:"+div);  
            break;
            }
            div++;
        }
        
    }
    
}

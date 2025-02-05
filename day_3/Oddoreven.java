import java.util.*;
public class Oddoreven {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a number upto 10:");
        int i=get.nextInt();

        for(i=0;i<=10;i++){
            if(i%2==0){
                System.out.println(i+ "it is even");
            }
            else{
                System.out.println(i+ "it is odd");
            }
        }
    }

    
}
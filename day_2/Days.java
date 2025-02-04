import java.util.*;
public class Days {
    public static void main(String[] args) {
        Scanner get=new Scanner(System.in);
        System.out.println("enter a number between 1-7:");
        String day="";
        int num=get.nextInt();
        switch(num){
            case 1: day="Sunday";
            break;
            case 2: day="Monday";
            break;
            case 3: day="Tuesday";
            break;
            case 4: day="Wednesday";
            break;
            case 5: day="Thursday";
            break;
            case 6: day="Friday";
            break;
            case 7: day="Saterday";
            break;
            default:
              System.out.println("Invalid number");


        }
        System.out.println(day);
        
    }
    
}

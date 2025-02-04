import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a mark:");
        int Mark=sc.nextInt();
        if(Mark>=90){
            System.out.println("your Grade is A");

        }
        else if(Mark<90 && Mark>=80){
        System.out.println("your grade is B");

        }
        else{
            System.out.println("fail");
        }
        
    }
}

import java.util.Scanner;
class hello{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter no:");
        int num=scan.nextInt();
        if((num & 1)==1){
            System.out.println("odd");

        }
        else{
            System.out.println("even");
        }
    }
}
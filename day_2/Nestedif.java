public class Nestedif {

    public static void main(String[] args) {
        int attanance=60;
        bool hasticket=true;
        if(hasticket==true){
            if(attanance>=60){
                System.out.println("eligible for exam");
            else
            {
            System.out.println("pay fine then go for exam");

            }
         }
        else{
                    System.out.println("Not eligible");
            }
            
        }
    }
}


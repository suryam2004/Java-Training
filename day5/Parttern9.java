public class Parttern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=10;i++){
            int totalcolinRow=i>n?2*n-i:i;
            int spaces=n-totalcolinRow;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int k=totalcolinRow;k>0;k--){
              System.out.print(k);
            }
        for(int l=2;l<=totalcolinRow;l++){
            System.out.print(l);
        }
        System.out.println();
        }

        
        
    }
    
}

public class Amstrong {
    public static void main(String[] args) {
        int n=153;
        int count=0;
        for(int i=n;i>0;i=i/10){
            count++;
        }
        int rem=0,result=0;
        int temp=n;
        while(temp!=0){
            rem=temp%10;
            //result=result+(rem*rem*rem);
            result=result+(int)Math.pow(rem,count);
            temp=temp/10;

        }
        if(n==result){
            System.out.println("it is a Amstrong");

        }
        else{
            System.out.println("it is not a Amstrong");
        }
    }
    
}

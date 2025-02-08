public class Secondmin {

    public static void main(String[] args) {
        int a[]={4,8,3,6,1};
        int first=9;
        int second=9;
        for(int i=0;i<a.length;i++){
            if(first>a[i]){
                second=first;
                first=a[i];
            }
            else if(second>a[i]){
                second=a[i];
            
            }
        }
            System.out.println(second);
        
        
    }
}
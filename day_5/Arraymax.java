public class Arraymax {
    public static void main(String[] args) {
        
    
    int a[]={2,5,78,45,3};
    int max=a[0];
    for(int i=0;i<a.length;i++){
        if(max<a[i]){
            max=a[i];
        }
        System.out.println(max);
    }
    
}
}

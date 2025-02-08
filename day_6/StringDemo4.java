public class StringDemo4 {
    public static void main(String[] args) {
        String str="A B C D";
        String res="";
        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);

        }
        System.out.println(res);

    }
    
}

public class StringDemo5 {
    public static void main(String[] args) {
        String str="could you maintain silence";
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.equals("")){
                count=0;
                break;
            }
            if(str.charAt(i)==' '){
                count++;
            }
            else{
                continue;
            }

        }
        System.out.println(count);
    }
    
}

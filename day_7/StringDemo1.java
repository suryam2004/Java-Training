public class StringDemo1 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2);
        String s3="abc";
        String s4=s3;
        System.out.println(s1==s2);
        String s5="ab";
        String s6="abc";
        s5+='c';
        System.out.println(s5==s6);
    }
    
}

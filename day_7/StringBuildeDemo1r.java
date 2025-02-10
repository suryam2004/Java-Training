public class StringBuildeDemo1r {
    public static void main(String[] args) {

        String s="hello";
        String s2=s;
        StringBuilder sb=new StringBuilder("hello");
        sb.append("world");
        s=sb.toString();
        System.out.println(s);
        StringBuilder sb1=new StringBuilder("cat");
        sb1.reverse();
        System.out.println(sb1);

        
    }
    
}

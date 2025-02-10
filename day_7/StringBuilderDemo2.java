public class StringBuilderDemo2 {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        //insert
        sb.insert(3, "pqr");
        System.out.println(sb);
        //replace
        sb.replace(0, sb.capacity(), "hello");
        System.out.println(sb);

        //delete
        StringBuilder sb1=new StringBuilder("hello world");
        sb1.delete(0, 4);
        System.out.println(sb1);
        

    }
}
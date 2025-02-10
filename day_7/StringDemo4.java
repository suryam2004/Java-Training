public class StringDemo4 {
    public static void main(String[] args) {
        String s1="hello all";
        System.out.println(s1.contentEquals("hello all"));//pass full charecter seqence


        //contains metheds
        String s2="Good moring alll";
        System.out.println(s2.contains("o"));
        System.out.println(s2.contains("mo"));
    }
    
}

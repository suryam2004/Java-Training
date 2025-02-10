public class StringDemo5 {
    public static void main(String[] args) {
        String s="hello world";
        //index of
        System.out.println(s.indexOf("o"));

        //indexof character from specific index
        System.out.println(s.indexOf("o", 5));
        //lastIndexof return the last index of specified character
        System.out.println(s.lastIndexOf("o"));

        //substring
        System.out.println(s.substring(2));
        System.out.println(s.substring(0,s.length()));


        //subSquence
        System.out.println(s.subSequence(1, 10));
    }

    
}

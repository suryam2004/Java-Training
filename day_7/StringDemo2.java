public class StringDemo2 {
    public static void main(String[] args) {
        String s1="abc";
        String s2="ABC";
        System.out.println(s1.equalsIgnoreCase(s2));//upper and lowercase are not consider



        String s3="ABC";
        String s4="abc";
        System.out.println(s3.compareTo(s4));
        //return 0 is both the string are same
        //return negative if not same s3<s4
        //return positive if not same s3>s4


        System.out.println(s3.compareToIgnoreCase(s4));

    }
    
}

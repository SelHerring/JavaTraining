package Second_Chapter;

/**
 * Created by Денис on 07.11.2016.
 */

public class Polindrome{
    public static void main(String[] args) {
        Integer a = new Integer(6);
        Float b = new Float(6.4f);
        Double c = new Double(7.8d);
        String s1 = a.toString();
        String s2 = b.toString();
        String s3 = c.toString();

        Integer s11 = new Integer(s1);
        Float s22 = new Float(s2);
        Double s33 = new Double(s3);
        System.out.println(s11 +" "+ s22 +" "+ s33);

        String str = "Madam, I'm Adam!";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String text) {
        String abc = text.toLowerCase().replaceAll("\\W", "");
        System.out.println(abc);
        String abcr = new StringBuilder(text).reverse().toString().toLowerCase().replaceAll("\\W", "");
        boolean eq = abcr.equals(abc);
        return eq;
    }
}

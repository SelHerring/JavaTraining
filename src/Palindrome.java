/**
 * Created by Денис on 22.09.2016.
 */

public class Palindrome {
    public static boolean isPalindrome(String text) {
        String abc = text.toLowerCase().replaceAll("\\W", "");
        String abcr = new StringBuilder(text).reverse().toString().toLowerCase().replaceAll("\\W", "");
        boolean eq = abcr.equals(abc);
        System.out.println(abc);
        System.out.println(abcr);
        return eq;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!"));
    }
}

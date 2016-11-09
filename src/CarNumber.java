/**
 * Created by Денис on 09.11.2016.
 */
public class CarNumber {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        char[] symbols = new char[2*letters.length() + numbers.length()];
        int i = 0;
        for (char letter : letters.toCharArray()) {
            symbols[i] = letter;
            i++;
        }
        for (char letter : letters.toUpperCase().toCharArray()) {
            symbols[i] = letter;
            i++;
        }
        for (char number : numbers.toCharArray()) {
            symbols[i] = number;
            i++;
        }
        System.out.println(symbols);
    }
}


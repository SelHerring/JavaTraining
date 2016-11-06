package First_Chapter;

/**
 * Created by Денис on 01.11.2016.
 */

public class SimpleNumbers {
    public static void main(String[] args) {
        int n;
        for (int i = 1; i <1001; i++) {
            n = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    n++;
            }
            if (n <= 2) System.out.println(i);
        }
    }
}


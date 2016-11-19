import java.util.Random;

/**
 * Created by Денис on 19.11.2016.
 */
public class Snils {
    public static void main(String[] args) {
        System.out.println(Snils());
    }

    public static String Snils() {
        int[] a = new int[9];
        StringBuilder snils = new StringBuilder();
        //StringBuilder snilsOrig = new StringBuilder();
        Random r = new Random();
        int s = 0;
        int[] b = new int[9];
        for (int i = 0; i < 9; i++) {
            a[i] = r.nextInt(9);
            b[i] = a[i];
            snils.append(a[i]);
            if ((i == 2) || (i == 5)) {
                snils.append("-");
            }
        }

        snils.append(" ");

        for (int i = 0, j = 9; i < 9; i++, j--){
                s = s + (b[i] * j);
        }
        if ((s == 100)|| (s == 101)) snils.append("00");
        if (s > 101){
            s = s % 101;
        }
        if (s <= 9) snils.append("0");

        snils.append(s);

        return snils.toString();
    }
}

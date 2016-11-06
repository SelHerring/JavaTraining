/**
 * Created by Денис on 18.09.2016.
 */

import java.lang.*;

class CharChange { //2.2.3
    public static char charExpression(int a) {
        int ch = (int) '\\';
        char chr = (char) (ch + a);
        return chr;
    }

    public static void main(String[] args) throws java.lang.Exception {
        System.out.println(charExpression(12));
    }
}


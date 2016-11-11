import java.util.ArrayList;
import java.util.Random;

public class CarNumber {
    private static String TakeLetter() {
        Random r = new Random();
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "X", "У"};

        return letters[r.nextInt(letters.length)];
    }

    private static String TakeRegion() {
        ArrayList<String> regionCodes = new ArrayList(121);
        ArrayList<String> additionalRegions = new ArrayList(21);
        Random r = new Random();
        for (int i = 1; i <= 99; i++) {
            String s = new String();
            s += i;
            if (i <= 9) s = "0" + s;
            regionCodes.add(s);
            if (i == 20) regionCodes.remove(s);
        }
        for (int i = 0; i <= 22; i++) {
            String[] s = {"102", "113", "116", "121", "124", "125", "138", "150", "152", "154",
                    "159", "161", "163", "164", "173", "174", "177", "190", "199", "197", "198", "750", "777"};
            additionalRegions.add(s[i]);
        }
        regionCodes.addAll(additionalRegions);
        String[] arr = regionCodes.toArray(new String[regionCodes.size()]);

        return arr[r.nextInt(regionCodes.size())];
    }

    public static String Generation() {
        Random r = new Random();
        StringBuilder carNumber = new StringBuilder();
        carNumber.
                append(TakeLetter()).
                append(" ").
                append(r.nextInt(9)).append(r.nextInt(9)).append(r.nextInt(9)).
                append(" ").
                append(TakeLetter()).
                append(TakeLetter()).
                append(" ").
                append(TakeRegion());

        return carNumber.toString();
    }
}


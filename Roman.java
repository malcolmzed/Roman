
import java.util.*;
public class Roman {

//    static public int getRomanValue (char character) {
//            return romanValues[romanString.indexOf(character)];
//    }

    public static int convertToDecimal(String roman) {
        Hashtable<String, Integer> romanValues = new Hashtable<>();
        romanValues.put("I", 1);
        romanValues.put("V", 5);
        romanValues.put("X", 10);
        romanValues.put("L", 50);
        romanValues.put("C", 100);
        romanValues.put("D", 500);
        romanValues.put("M", 1000);




        int value;
        int runningTotal = 0;

        for (int i = 0; i < roman.length(); i++) {
            value = romanValues.get(String.valueOf(roman.charAt(i)));

            if (i < roman.length() - 1
                && value < romanValues.get(String.valueOf(roman.charAt(i + 1)))) {
                value = -1 * value;
            }

            runningTotal = runningTotal + value;

        }
        return runningTotal;
    }
}
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int total = 0;
        int prevValue = 0;
        for (int i = 0; i < s.length(); i++) {
            int curValue = m.get(s.charAt(i));
            if (curValue > prevValue) {
                total += curValue - 2 * prevValue;
            } else {
                total += curValue;
            }
            prevValue = curValue;
        }
        return total;
    }

    public static void main(String[] args) {
        String romanNumeral = "MCMXCIV";
        System.out.println(romanToInt(romanNumeral)); // Output: 27
    }
}

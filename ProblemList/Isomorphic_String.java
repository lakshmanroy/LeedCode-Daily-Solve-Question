import java.util.HashMap;

public class Isomorphic_String {
    public static boolean isomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hm = new HashMap<Character, Character>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (hm.containsKey(sChar)) {
                if (!hm.get(sChar).equals(tChar)) {
                    return false;
                }
            }
            if (hm.containsKey(tChar)) {
                return false;
            }
            hm.put(sChar, tChar);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";

        System.out.println(isomorphic(s, t));
    }
}

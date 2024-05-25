public class Find_Defference {
    public static char findDefference(String s, String t) {
        int total = 0;
        for (int i = 0; i < t.length(); i++) {
            total = total + t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            total = total - s.charAt(i);
        }
        return (char) total;
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        System.out.println(findDefference(s, t));
    }
}

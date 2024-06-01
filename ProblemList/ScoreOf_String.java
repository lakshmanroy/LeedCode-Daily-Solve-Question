public class ScoreOf_String {
    public static int ScoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += (int) Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }

    public static void main(String[] args) {
        String s = "hello";

        System.out.println(ScoreOfString(s));
    }
}

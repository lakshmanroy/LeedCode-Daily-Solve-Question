public class PrefixCounter {
    public static int countPrefix(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        int result = countPrefix(words, pref);
        System.out.println(result); // Output: 2
    }
}

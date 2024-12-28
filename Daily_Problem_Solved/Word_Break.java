// package Daily_Problem_Solved;

import java.util.Arrays;
import java.util.List;

public class Word_Break {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (String word : wordDict) {
                if (i >= word.length() && dp[i - word.length()] && s.substring(i - word.length(), i).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        Word_Break wordBreak = new Word_Break();
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        boolean result = wordBreak.wordBreak(s, wordDict);
        System.out.println("Can the word be segmented? " + result);
    }
}

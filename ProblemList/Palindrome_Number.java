// package ProblemList;

// // package ProblemList;

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 121;

        System.out.println(isPalindrome(x));
    }
}

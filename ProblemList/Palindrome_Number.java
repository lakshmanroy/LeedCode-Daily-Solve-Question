package ProblemList;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int temp = x;
        int rev = 0;
        while (temp != 0) {
            int rem = temp % 10;
            temp = temp / 10;
            rev = rev * 10 + rem;
        }
        return x == rev;
    }

    public static void main(String[] args) {
        int x = 121;

        Palindrome_Number obj = new Palindrome_Number();
        boolean result = obj.isPalindrome(x);

        if (result) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }

    }

}
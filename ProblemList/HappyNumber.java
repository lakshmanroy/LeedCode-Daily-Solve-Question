public class HappyNumber {
    public static boolean isHappy(int n) {
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }

    public static void main(String[] args) {
        int n = 19;

        System.out.println(isHappy(n));
    }
}

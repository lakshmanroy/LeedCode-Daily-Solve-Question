public class Power_Of_Four {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        while (n > 1 && (n % 4 == 0)) {
            n = n / 4;
        }
        return (n == 1 || n % 4 == 0) ? true : false;
    }

    public static void main(String[] args) {
        int n = 16;

        System.out.println(isPowerOfFour(n));
    }
}

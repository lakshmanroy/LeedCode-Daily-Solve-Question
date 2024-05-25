public class Power_Of_Two {
    public static boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            } else {
                n = n / 2;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 1;

        System.out.println(isPowerOfTwo(n));
    }
}

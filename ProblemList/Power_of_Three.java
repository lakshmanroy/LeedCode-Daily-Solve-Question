public class Power_of_Three {
    public static boolean isPowerThree(int n) {
        while (n >= 3) {
            if (n % 3 != 0) {
                return false;
            }
            n = n / 3;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 27;
        System.out.println(isPowerThree(n));
    }
}

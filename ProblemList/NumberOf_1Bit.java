public class NumberOf_1Bit {
    public static int hammingWeight(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return hammingWeight(n & (n - 1)) + 1;
    }

    public static void main(String[] args) {
        int n = 11;

        System.out.println(hammingWeight(n));
    }
}

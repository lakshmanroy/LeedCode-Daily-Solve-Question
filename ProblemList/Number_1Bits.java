public class Number_1Bits {
    public static int numberOf_1Bit(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println(numberOf_1Bit(n));
    }
}

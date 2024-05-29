public class Reverse_Bit {
    public static int reverseBit(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += n % 2;
            n >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        // Correct representation of binary literal
        int n = 0b00000010100101000001111010011100;

        System.out.println(reverseBit(n));
    }
}

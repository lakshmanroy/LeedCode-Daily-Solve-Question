public class ReverseBit {
    public static int reverseBit(int n) {
        int ans = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                ans += 1 << 31 - i;
            }
            mask <<= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 0b00000010100101000001111010011100;
        System.out.println(reverseBit(n));
    }
}

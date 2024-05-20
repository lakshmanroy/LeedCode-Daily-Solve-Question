import java.lang.reflect.Array;
import java.util.Arrays;

public class Plus_One {
    public static int[] plusone(int digit[]) {
        int n = digit.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digit[i] < 9) {
                digit[i]++;
                return digit;
            }
            digit[i] = 0;
        }
        int[] newNUmber = new int[n + 1];
        newNUmber[0] = 1;
        return newNUmber;
    }

    public static void main(String[] args) {
        int digit[] = { 1, 2, 3 };
        System.out.println(Arrays.toString(plusone(digit))); 
    }
}

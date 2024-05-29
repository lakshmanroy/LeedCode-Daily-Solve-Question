public class AddDigit {
    public static int addDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return (num % 9 == 0) ? 9 : num % 9;
    }

    public static void main(String[] args) {
        int num = 38;

        System.out.println(addDigit(num));
    }
}

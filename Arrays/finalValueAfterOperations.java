// package Arrays;

public class finalValueAfterOperations {
    public static int finalOperation(String str[]) {
        int res = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].charAt(i) == '+') {
                res++;
            } else {
                res--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String operations[] = { "--x", "x++", "x++" };

        System.out.println(finalOperation(operations));
    }
}

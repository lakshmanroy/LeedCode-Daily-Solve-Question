// package Arrays;

public class Number_pairs {
    public static int pairs(int nums[]) {
        int tp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    tp++;
                }
            }
        }
        return tp;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 1, 3 };

        System.out.println(pairs(nums));
    }
}

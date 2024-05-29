public class Single_Number {
    public static int single(int nums[]) {
        int value = 0;
        for (int i = 0; i < nums.length; i++) {
            value = value ^ nums[i];
        }
        return value;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 1, 2, 1, 2 };

        System.out.println(single(nums));
    }
}

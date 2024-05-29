public class Missing_Number {
    public static int missing(int nums[]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int actualNum = (nums.length * (nums.length + 1)) / 2;
        int missingNum = actualNum - sum;

        return missingNum;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };

        System.out.println(missing(nums));
    }
}

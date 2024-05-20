public class RemoveDuplicate {
    public static int removeDuplicate(int nums[]) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                nums[++k] = nums[i];
            }
        }
        return ++k;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };

        System.out.println(removeDuplicate(nums));
    }
}
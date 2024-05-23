public class ConcatenationArray {
    public static int[] getConcatenation(int nums[]) {
        int ans[] = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1 };

        int result[] = getConcatenation(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}

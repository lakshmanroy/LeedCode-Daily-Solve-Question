
import java.util.Arrays;

public class Majority_Element {
    public static int MajorityElement(int nums[]){
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];
    }
    public static void main(String[] args) {
        int nums[]= {3,2,3};

        System.out.println(MajorityElement(nums));
    }
}

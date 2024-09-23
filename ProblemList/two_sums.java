
import java.util.Arrays;

public class two_sums {
    public static int[]  twoSum(int nums[],int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String args[]){
        int nums[]= {2,7,11,15};
        int target=9;

        two_sums solution= new two_sums();
        int result[]= solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

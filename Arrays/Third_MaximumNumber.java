import java.util.Arrays;
public class Third_MaximumNumber {
    public static int thirdMax(int nums[]){
        int n=nums.length;
        Arrays.sort(nums);
        int count=1;
        for(int i=n-1;i>=0;i--){
           if(nums[i]!=nums[i-1]){
            count++;
           }
           if(count==3){
            return nums[i-1];
           }
        }
        return nums[n-1];

    }
    public static void main(String[] args) {
        int nums[]={3,2,1};

        System.out.println(thirdMax(nums));
    }
}

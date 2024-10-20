public class MissingNumbers {
    public static int missing(int nums[]){
        int n=nums.length;
        int actualSum=0;
        int mid=n*(n+1)/2;
        for(int i=0;i<n;i++){
            actualSum+=nums[i];
        }
        return mid-actualSum;
    }
    public static void main(String[] args) {
        int nums[]={3,0,1};

        System.out.println(missing(nums));
    }
}

public class SearchInRotated_SortedArrayII {
    public static boolean  search(int nums[],int target){
        int left=0,right=nums.length-1;
        while(left<right){
            int mid= (left+right)/2;
            
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]<=target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={2,5,6,0,0,1,2};
        int target=3;

        System.out.println(search(nums, target));
    }
}

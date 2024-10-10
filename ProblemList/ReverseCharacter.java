public class ReverseCharacter {
        public static void reverse(char s[]){
            int left=0;
            int right=s.length-1;
            
            while(left<right){
                char temp=s[left];
                s[left]=s[right];
                s[right]=temp;
                
                left++;
                right--;
            }
        }
        public static void printArr(char arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+ " ");
            }
        }
        
        public static void main(String args[]){
            char s[]= {'L','A','K','S','H','M','A','N'};
            
            reverse(s);
            printArr(s);
        }
    }

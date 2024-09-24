public class Fibonacci_Series {
    public static void Fibonacci(int n){
        int num1=0,num2=1;
        for(int i=0;i<n;i++){
            System.out.print(num1+" ");

            int temp=num2+num1;
            num1=num2;
            num2=temp;
        }
    }
    public static void main(String[] args) {
        int n=10;
        Fibonacci(n);

    }
}

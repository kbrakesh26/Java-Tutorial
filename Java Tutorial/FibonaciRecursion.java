import java.util.Scanner;
public class FibonaciRecursion{
    static int fib(int n){
        
        //base case

        if(n==0||n==1){
            return n;
        }

        //sub-Problem

        int prev=fib(n-1);
        int prevPrev=fib(n-2);

        //SelfWork

        return prev+prevPrev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        System.out.println(fib(n));
    }
}
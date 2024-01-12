import java.util.Scanner;
public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int countDigit=0;
        while(num>0){
            num= num/10;
            countDigit++;
        }
        System.out.println("Number of digit in"+ num + "=" + countDigit);

    }
}

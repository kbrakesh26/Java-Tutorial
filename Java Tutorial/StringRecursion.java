import java.util.Scanner;

public class StringRecursion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        //Taking String input
        String s=sc.nextLine();
        //Printing of the String
        System.out.println(s);
        //Character of the String
        char ch=s.charAt(2);
        System.out.println(ch);
        //Character from one index to other of the string
        System.out.println(s.substring(2,6));
        //All Characters of the string
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }
}
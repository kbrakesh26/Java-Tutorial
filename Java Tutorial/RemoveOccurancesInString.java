import java.util.Scanner;
public class RemoveOccurancesInString{

    //SECOND METHOD( Time complexity is O(n*2))
    static String removeA2(String s){
        if(s.length()==0) return " ";
        String smallAns=removeA2(s.substring(1));
        char currChar=s.charAt(0);
        if(currChar!='a'){
            return currChar+smallAns;
        } else {
            return smallAns;
        }
    }

    //FIRST METHOD( Time Complexity is O(n*2))
    static String removeA(String s,int idx){

        //BASE CASE
        if(idx==s.length()) return " ";

        //RECURSIVE WORK
        String smallAns=removeA(s,idx+1);
        char currChar=s.charAt(idx);
        if(currChar!='a'){
            return currChar+smallAns;
        } else {
            return smallAns;
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER THE STRING: ");
        String s=sc.nextLine();
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));
    }
}
public class PrintSSQ{
    static void printSSQ(String s, String currAns){
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
        //Current character excluded
        printSSQ(remString , currAns+curr);
        //Current character included
        printSSQ(remString , currAns);
    }
    public static void main(String[] args) {
        printSSQ("abc"," ");
    }
}
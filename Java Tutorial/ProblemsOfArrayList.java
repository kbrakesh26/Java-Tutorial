import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ProblemsOfArrayList{
    static void reverseList(ArrayList<Integer>list){
        int i=0, j=list.size()-1;
        while(i<j){
            Integer temp=Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(i, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(28);
        list.add(30);
        System.out.println("Original Arraylist: " + list);
        reverseList(list);
        Collections.reverse(list);
        System.out.println("Reversed Arraylist: " + list);
        Collections.sort(list);
        System.out.println("Ascending Order: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Decending Order: " + list);

        ArrayList<String>l1=new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Java");
        l1.add("Programming");
        l1.add("Series");
        System.out.println("Original String: " + l1);
        Collections.sort(l1);
        System.out.println("Sorted String: " + l1);
        Collections.sort(l1 , Collections.reverseOrder());
        System.out.println("Sorted2:  " + l1);
    }
}
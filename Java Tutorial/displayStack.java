import java.util.Stack;

public class displayStack{
    // Reversing the element using recursion
     public static void displayReverseRec(Stack<Integer> st){
         if(st.size()==0) return;
         int top=st.pop();
         System.out.print(top+" ");
         displayReverseRec(st);
         st.push(top);
    }
    // Displaying Stacks
    public static void displayRec(Stack<Integer> st){
         if(st.size()==0) return;
         int top=st.pop();
         displayRec(st);
         System.out.print(top+" ");
         st.push(top);
    }
public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    displayRec(st);
    System.out.println(st);

    //Removing an element from the bottom
    Stack<Integer> rt=new Stack<>();
    while(st.size()>1){
        rt.push(st.pop());
    }
    System.out.println(st);
}
}
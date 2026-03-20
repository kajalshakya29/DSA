import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stack <Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st);
        //FOR FIRST ELEMENT
        while (st.size()!=1){  //-->>O(n)
            st.pop();
        }
        System.out.println(st);

    }
}
package Stack2;
import java.util.Stack;

public class PrintStackInSameOrderRec {
    public static void displayRev(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top=st.pop();
        displayRev(st);
        System.out.print(top+ " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        displayRev(st);
    }
}

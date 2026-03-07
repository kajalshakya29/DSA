import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        int idx=2;
        Stack<Integer>rt=new Stack<>();
        while (st.size()>idx +1){
            rt.push(st.pop());
        }
        st.pop();

        while (!rt.isEmpty()){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}
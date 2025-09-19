import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        //System.out.println(st.isEmpty());
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        System.out.println(st);

        Stack<Integer>st_reverse=new Stack<>();
        while(!st.isEmpty()){
            //int ele = st.pop();
            //st_reverse.push(ele);

            //-----OR-----
            st_reverse.push(st.pop());  //-----TC=O(N) ----SC=O(N)
        }
        System.out.println(st_reverse);
    }
}
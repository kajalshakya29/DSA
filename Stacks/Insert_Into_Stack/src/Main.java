import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        //System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        //System.out.println(st);

        int new_Ele=50;
        int pos=2;
        Stack<Integer> st_temp=new Stack<>();
        while (st.size() >= pos){   //tc=O(N)   ,   sc=0(n)
            st_temp.push(st.pop());
        }
        st.push(new_Ele);
        while (st_temp.size() >0){
            st.push(st_temp.pop());
        }
        System.out.println(st);
    }
}
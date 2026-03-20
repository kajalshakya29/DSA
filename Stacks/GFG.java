import java.util.Stack;

class GfG {
    public static void main(String[] args) {

        // creating a stack of integers
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        // Printing current top element
        System.out.print(st.peek() + " ");

        // removes the top element from the stack
        st.pop();

        // Printing current top element
        System.out.print(st.peek() + " ");

        // removes the top element from the stack
        st.pop();
        System.out.print(st.peek() + " ");
    }
}
package Stack2;

public class ArrayStackImpl {
    public static class Stack{
        private int[] arr=new int[5];
        private int idx=0;
        void push(int x){
            if(isFull()){
                System.out.println("stack is full ");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int pop(){
            if (isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top= arr[idx-1];
            idx--;
            return top;
        }
        int peek(){
            if (idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int size(){
            return idx;

        }
        boolean isEmpty(){
            if (idx==0) return true;
            else return false;
        }
        boolean isFull(){
            if (idx==arr.length) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.display();
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.display();
    }
}

package Stack2;

public class LinkedListImpl {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }
        public static class Stack{
            Node head=null;
            int size=0;
            void display(){
                displayRec(head);
            }
            void displayRec(Node h){
                if(h==null) return;
                displayRec(h.next);
                System.out.println(h.val);
            }
            void push(int x){
                Node temp=new Node(x);
                temp.next=head;
                head=temp;
                size++;
            }
            int size(){
                return size;
            }
            int pop(){
                if (head==null){
                    System.out.println("stack is empty");
                    return -1;
                }
                int x=head.val;
                head=head.next;
                size--;
                return x;
            }
            int peek(){
                if (head==null){
                    System.out.println("stack is empty");
                    return -1;
                }
                int x=head.val;
                return x;
            }
            boolean isEmpty(){
                if (size==0) return true;
                else return false;
            }
        }
    }
    public static void main(String[] args) {
        ArrayStackImpl.Stack stack=new ArrayStackImpl.Stack();
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
//        System.out.println(stack.isFull());
//        stack.display();
    }
}

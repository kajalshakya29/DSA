//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

class SLL{
    private Node head;
    private Node tail;
    private int size;
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");  // tc=(n) sc=(1)
            temp=temp.next;
        }
        System.out.println();
    }
    public void size(){
        System.out.println("size of linked list is " + size);  // tc = O(1) --> implemented ll else tc=(n) --> if head is not provided
    }
    void insertAtTail(int val){
        Node temp = new Node(val);
        if (head==null) head=tail=temp;
        else {
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    void insertAtHead(int val){
        Node temp = new Node(val);
        if (head==null) head=tail=temp;
        else {
            temp.next=head;
            head=temp;
        }
        size++;
    }
}

public class ImplementationLL {
   public static void main(String[] args){
        SLL list = new SLL();

      /*  list.size();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.print();
        list.size();
        list.insertAtTail(25);
        list.print();
        list.size();   */

       list.insertAtTail(10);
       list.insertAtTail(20);
       list.insertAtTail(30);
       list.insertAtTail(40);
       list.insertAtTail(50);
       list.print();
       list.insertAtHead(60);
       list.print();               //tc=O(1), sc=O(1) --> when we have tail | else tc=O(n)


    }
}
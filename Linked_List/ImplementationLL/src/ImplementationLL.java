//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

//sc=O(1)
class SLL{
    private Node head;
    private Node tail;
    private int size;

    int get(int idx) throws  Error{     // tc=O(1)
        if (idx==size-1) return tail.val;
        if (idx>=size || idx<0){
            throw new Error("Bhayi error");
        }
        Node temp =head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val) throws  Error{       // tc=O(1)
        if (idx==size-1) tail.val=val;
        if (idx>=size || idx<0){
            throw new Error("Bhayi error");
        }
        Node temp =head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;
        }
        temp.val=val;
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+" ");  // tc=o(n) sc=o(1)
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

    void insert(int idx, int val){
        if (idx==0){           //tc=O(1)
            insertAtHead(val);
            return;
        }
        if (idx==size){            //tc=O(1)
            insertAtTail(val);
            return;
        }
        if (idx > size){           //tc=O(1)
            System.out.println("Invalid Index!!");
            return;
        }

        Node temp=new Node(val);
        Node x = head;
        for (int i = 1; i <=idx-1 ; i++) {    //tc=O(n)
            x=x.next;
        }
        //insertion
        temp.next=x.next;
        x.next=temp;
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
       list.insert(3,100);
       list.print();
       list.insert(7,80);
       list.print();
       list.insert(9,23);
       list.print();
       System.out.println(list.get(3 ));
       System.out.println(list.get(1));
       list.print();
       list.set(3,32);
       list.print();

    }
}
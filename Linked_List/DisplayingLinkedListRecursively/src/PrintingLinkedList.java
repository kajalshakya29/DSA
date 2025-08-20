//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class PrintingLinkedList {
    public static void print(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    public static void displayRecursive(Node head){ //shallow copy
        if (head==null) return; //base case
        //System.out.println(head.val);
        displayRecursive(head.next);
        System.out.println(head.val);

    }
    public static void main(String[] args) {
        //setting values
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        displayRecursive(a);
        System.out.println(a.val);

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Node{
    int val;
    Node next;
    Node temp;
    Node(int val){
        this.val=val;
    }
}

public class ShallowCopyOfNode {
    public static void main(String[] args) {
        //setting values
       Node a = new Node(100);
       Node temp=a; // shallow copy
       //  Node temp= new Node(100);  //deep copy
       System.out.println(a.val);
       System.out.println(temp.val);
        System.out.println(a);
        System.out.println(temp);
    }
}
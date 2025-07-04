import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReversePrinting {
    public static void reversePrint(int n){
        if(n==0) return;
        System.out.println(n);
        reversePrint(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : n");
        int n=sc.nextInt();
        reversePrint(n);
    }
}
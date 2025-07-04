import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrintIncreasingAfterCall {
    public static void reversePrint(int n){
        if(n==0) return;
        reversePrint(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : n");
        int n=sc.nextInt();
        reversePrint(n);
    }
}
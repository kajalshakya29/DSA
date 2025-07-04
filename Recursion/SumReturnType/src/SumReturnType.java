import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SumReturnType {
    public static int sum(int n) {
        if (n == 1 || n == 0) return 1;
        int ans = n + sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : n");
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
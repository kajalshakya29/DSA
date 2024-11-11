import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LowerAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print((char) (j+96)+" ");
            }
            System.out.println();
        }
    }
}
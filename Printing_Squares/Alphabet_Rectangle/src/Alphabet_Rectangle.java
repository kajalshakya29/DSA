import java.util.Scanner;

public class Alphabet_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print((char) (i+ 64) + " ");
            }
            System.out.println();
        }
    }
}


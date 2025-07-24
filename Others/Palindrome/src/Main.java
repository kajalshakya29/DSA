import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String n = sc.next();  // Read input as a String

        int i = 0, j = n.length() - 1;
        while (i < j) {
            if (n.charAt(i) != n.charAt(j)) {
                System.out.println("Not a palindrome");
                return;  // Exit the method
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");

        sc.close();
    }
}

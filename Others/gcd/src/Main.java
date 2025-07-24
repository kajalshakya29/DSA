import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int gcd = 1;
        for(int i = 1; i < a && i < b; i++ )
        {
            if(a%i==0 && b%i==0)
            {
                gcd = i;
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
       // Scanner.close();
    }
}

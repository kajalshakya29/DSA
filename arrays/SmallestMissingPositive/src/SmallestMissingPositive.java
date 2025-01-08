import java.util.Scanner;
public class SmallestMissingPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the sorted array elements
        System.out.print("Enter the sorted array elements (comma-separated): ");
        String input = scanner.nextLine();
        String[] strArray = input.split(",");
        int[] sortedArray = new int[strArray.length];
        // Convert input string array to int array
        for (int i = 0; i < strArray.length; i++) {
            sortedArray[i] =
                    Integer.parseInt(strArray[i].trim());
        }
        // Find the smallest missing positive element
        int smallestMissing = findSmallestMissingPositive(sortedArray);
        // Output
        System.out.println("The smallest missing positive element is: " + smallestMissing);
        scanner.close();
    }
    private static int findSmallestMissingPositive(int[] sortedArray) {
        int n = sortedArray.length;
        for (int i = 0; i < n; i++) {
            if (sortedArray[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
}
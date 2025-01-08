//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {9, 21, 19, 38, 41, 21, 19, 9}; // Example array with duplicates
        findDuplicates(arr);
    }
    public static void findDuplicates(int[] arr) {
        boolean foundDuplicate = false; // Flag to check if duplicates are found

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                    foundDuplicate = true; // Set the flag to true
                    break; // Break to avoid printing the same duplicate multiple times
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }
}
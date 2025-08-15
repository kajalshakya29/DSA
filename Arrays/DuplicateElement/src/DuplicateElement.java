
public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {9, 21, 19, 38, 41, 21, 19, 9};
        findDuplicates(arr);
    }
    public static void findDuplicates(int[] arr) {
        boolean foundDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                    foundDuplicate = true; // Set the flag to true
                    break;
                }
            }
        }
        if (!foundDuplicate) {
            System.out.println("No duplicate elements found.");
        }
    }
}
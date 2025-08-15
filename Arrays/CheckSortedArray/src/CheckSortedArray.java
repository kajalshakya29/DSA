public class CheckSortedArray {
    public static void main(String[] args) {
        int[] unsortedArray = {3, 1, 5, 2, 4};
        System.out.println("Is array sorted? " + isSorted(unsortedArray));
    }
    private static boolean isSorted(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return true;
        }
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 0; i < length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscending = false; // Not ascending
            }
            if (array[i] < array[i + 1]) {
                isDescending = false; // Not descending
            }
        }
        return isAscending || isDescending;
    }
}
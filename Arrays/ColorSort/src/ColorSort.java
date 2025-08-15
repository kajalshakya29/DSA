//Dutch flag national algorithm
public class ColorSort {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0}; sortColors(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void sortColors(int[] arr) {
        int n = arr.length; int mid = 0, hi = n - 1, lo = 0;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }
}
//WAP to find the largest three elements in the array.
public class LargestThreeElements {
    public static void main(String[] args) {
        int[] arr = {1, 12, 31, 49, 10, 38};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3 && arr[i] != max1 && arr[i] != max2) {
                max3 = arr[i];
            }
        }
        int[] largestEle = new int[3];
        largestEle[0] = max1;
        largestEle[1] = max2;
        largestEle[2] = max3;

        for (int ele : largestEle) {
            System.out.println(ele + " ");
        }
    }
}
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 3;
        nums1[2] = 4;
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = nums2.length;
        merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }
        while (i < m) {
            nums3[k++] = nums1[i++];
        }
        while (j < n) {
            nums3[k++] = nums2[j++];
        }
        for (int l = 0; l < m + n; l++) {
            nums1[l] = nums3[l];
        }
    }
}
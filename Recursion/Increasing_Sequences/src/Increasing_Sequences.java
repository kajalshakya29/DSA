import java.util.ArrayList;

public class Increasing_Sequences {
    static int n = 4;
    static int k = 2;

    public static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void printSeq(int start, ArrayList<Integer> ans) {
        if (ans.size() == k) {
            System.out.print(ans);
            return;
        }
        for (int i = start; i <= n; i++) {
            ans.add(i);
            printSeq(i + 1, ans);
            ans.remove(ans.size() - 1); // backtrack
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        printArray(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        printSeq(1, ans);
    }
}

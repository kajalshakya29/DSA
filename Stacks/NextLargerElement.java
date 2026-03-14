package Stack2;

import java.util.Stack;

public class NextLargerElement {

    public static long[] nextLargerEle(long[] arr) {

        int n = arr.length;
        long[] ans = new long[n];

        Stack<Long> stack = new Stack<>();

        ans[n - 1] = -1;
        stack.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(arr[i]);
        }

        return ans;
    }

    public static void main(String[] args) {

        long[] arr = {1, 3, 3, 4};

        long[] result = nextLargerEle(arr);

        for (long val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        for (long val : result) {
            System.out.print(val + " ");
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayConversion {
    public static void print(int[]arr){
        for (int ele : arr){
            System.out.print(ele+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr= {54,11,28,47,91,63};
        int n=arr.length;
        print(arr);
        int x=0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        for (int i = 0; i < n; i++) {
            arr[i]*=(-1);
        }
        print(arr);
    }
}
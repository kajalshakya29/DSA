//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SelectionSort {
    public static void print(int[]arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr={10,-4,20,1,-6,8};
        int n=arr.length;
        print(arr);
        //selection sort
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx=-1;
            for (int j = i; j < n; j++) {
                if (arr[j]<min){
                    min=arr[j ];
                    mindx=j;
                }
            }
            //swap
            swap(arr,i,mindx);

        }
        print(arr);
    }
}
//TC: O(n^2)
// SC: O(1)
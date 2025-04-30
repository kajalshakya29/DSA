//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bubble_Sort {
    public static void print(int[] arr){
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={5,1,3,4,2,-9,-6,-199,54,78,76,758,-87,645};
        int n = arr.length;
        print(arr);
//        //bubble sort 1
//        for (int x=0;x<n-1;x++){
//            for (int i = 0; i < n-1; i++) {
//                if (arr[i]>arr[i+1]){
//                    int temp=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }
//        //bubble sort 2
//        for (int x=0;x<n-1;x++){
//            for (int i = 0; i < n-1-x; i++) {
//                if (arr[i]>arr[i+1]){
//                    int temp=arr[i];
//                    arr[i]=arr[i+1];
//                    arr[i+1]=temp;
//                }
//            }
//        }
        //bubble sort optimized
        for (int x=0;x<n-1;x++){
            boolean flag=true;
            for (int i = 0; i < n-1-x; i++) {
                if (arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        print(arr);
    }
}

//time complexity = O(n^2)
// space complexity = O(n)

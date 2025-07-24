//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Inversion_Of_Count {
    static int count =0;
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
//    public static void inversion(int[] a, int[] b){
//        int i =0; int j=0;
//        while (i< a.length && j<b.length){
//            if(a[i]>b[j]){
//                count+=(a.length-i);
//                j++;
//            }
//            else i++;
//        }
//    }
    public static void merge(int[] a,int[] b,int[] c){
        int i=0; int j=0; int k=0;
        while (i<a.length && j<b.length){
            if (a[i]<=b[j]) c[k++] = a[i++];
            else {
                count+=(a.length-i);
                c[k++] = b[j++];
            }
        }
        while (j<b.length) c[k++]=b[j++];
        while (i<a.length) c[k++]=a[i++];
    }
    public static void mergeSort(int arr[]){
        int n=arr.length;
        if(n<=1)return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        //copy pasting
        for (int i = 0; i < n/2; i++) a[i] = arr[i];
        for (int i = 0; i < n-n/2; i++)b[i] = arr[i+n/2];
        //magic
        mergeSort(a);
        mergeSort(b);
       // inversion(a,b);
        merge(a,b,arr);
        a = null; b = null;
    }
    public static void main(String[] args) {

        int[] arr = {23,54,76,12,43,56,87};
        print(arr);
        mergeSort(arr);
        print(arr);
        System.out.println(count);
    }
}
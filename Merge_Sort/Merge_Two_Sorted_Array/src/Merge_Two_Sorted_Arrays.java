
public class Merge_Two_Sorted_Arrays {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a,int[] b,int[] c){
        int i=0; int j=0; int k=0;
        while (i<a.length && j<b.length){
            if (a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (j<b.length) c[k++]=b[j++];
        while (i<a.length) c[k++]=a[i++];
    }
    public static void main(String[] args) {
        int[] a = {10,30,50,70};
        int[] b = {20,40,60,80};
        print(a);
        print(b);
        int[] c = new int[a.length+b.length];
        merge(a,b,c);
        print(c);
    }
}
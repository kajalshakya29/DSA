//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SortZeroesOnesTwos {
    public static void main(String[] args) {
        int[] arr={0,1,2,2,1,0,0,1,1,1,0,2};
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        int n=arr.length;
        int j=0;int k=0; int l=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==0)j++;
            if (arr[i]==1)k++;
        }
        for (int i = 0; i < n; i++) {
            if(i<j) arr[i]=0;
            else if ((i<j+k)) {
                arr[i]=1;
            }
            else arr[i]=2;
        }
        for(int ele:arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
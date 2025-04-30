//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CheckArrayIsSortedNot {
    public static void main(String[] args) {
      int arr[]={1,4,7,2,10,3};
      int n = arr.length;
      boolean flag = true;// true means sorted

        for (int i = 0; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                flag=false;//false means unsorted
                break;
            }
        }
        if (flag==true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MinValue {
    public static void main(String[] args) {
        int[] arr = {20,10,8,91,23,38};
        int n = arr.length;
        int min = arr[0];
        for (int i = 0; i<n; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
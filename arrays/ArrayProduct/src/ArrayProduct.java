//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayProduct{
    public static void main(String[] args) {
        int[] arr = {9,21,19,38,41};
        int n = arr.length;
        int pro = 1;
        for (int i =0; i<n; i++){
            pro = pro*arr[i];
        }
        System.out.println(pro);
    }
}
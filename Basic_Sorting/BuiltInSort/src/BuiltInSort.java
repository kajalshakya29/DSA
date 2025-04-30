import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BuiltInSort {
    public static void main(String[] args) {
        int []arr={7,8,-9,4,2};
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr); //builtin sort function
        for (int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
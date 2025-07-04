import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SumParameterized {

    public static void sum(int n,int sum){
        //sum=0;
        if (n==0){
            System.out.println(sum);
            return;
        }
        sum(n-1,sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : n");
        int n=sc.nextInt();
        sum(n,0);
    }
}
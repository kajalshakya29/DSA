import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PowerLinear {
//    public static int pow(int a,int b) { // tc = O(b)
//        if (a==0 && b==0){
//            System.out.println("Not Defined");
//            return -1;
//        }
//        if (b == 0) return 1;
//        return (pow(a,b/2))*(pow(a,b/2));
//    }
    public static int powLog(int a,int b) {// tc = O(logb)
        if (a==0 && b==0){
            System.out.println("Not Defined");
            return -1;
        }
        if (b == 0) return 1;
        int ans = powLog(a,b/2);
        if (b%2==0) return ans*ans;
        else return ans *ans *a ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : base");
        int a=sc.nextInt();
        System.out.println("Enter : power");
        int b=sc.nextInt();
        System.out.println(a+ " raised to the power "+b+" is "+powLog(a,b));
    }
}
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GenerateParenthesis {
    public static void wellFormed(int open,int close,String s,int n){
        int m=s.length();
        if(m==n*2){
            System.out.println(s);
            return;
        }
        if(open<n) wellFormed(open+1,close,s+"(",n);
        if(close<open) wellFormed(open,close +1,s+")",n);
        //wellFormed(s+')',ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n =sc.nextInt();
       // ArrayList<String> ans= new ArrayList<>();
        wellFormed(0,0,"",n);
    }
}
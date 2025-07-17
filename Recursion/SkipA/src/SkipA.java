import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SkipA {
    public static void print(int i, String s) {
        if (i == s.length()) return;
        if (s.charAt(i) != 'a') {
            System.out.print(s.charAt(i));
        }
        print(i + 1, s);
    }
    public static void main(String[] args) {
       String s = "Raghav Garg";
       print(0,s);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PassingStringsToFunctions {
    public static void main(String[] args) {
        String s = "raghav";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
    public static void change(String s){
        s="madhav";     //no change, it is passing by value in strings
    }
}
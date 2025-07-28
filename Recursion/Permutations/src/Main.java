//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void permutation(String ans, String s){
        if (s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            permutation(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        String s="aa";
        System.out.println(s);
        permutation("",s);
    }
}
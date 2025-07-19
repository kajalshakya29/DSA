
public class Subsets {
    public static void subsets(String s){
        int i =0;
        if (i>s.length()) return ;
        while (i<=s.length()){
            System.out.print(s.charAt(i));
            i++;
        }
    }
    public static void main(String[] args) {
        String s = "HELLO";
        subsets(s);
    }
}
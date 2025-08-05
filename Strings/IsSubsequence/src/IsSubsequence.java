//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0,j=0;
        if(s.length()==0) return true;
        while(j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                if(i>=s.length())return true;
            }
            j++;
        }
        return false;
    }
    public static void main(String[] args) {
        IsSubsequence is = new IsSubsequence();
        System.out.println(is.isSubsequence("abc", "ahbgdc"));
    }
}
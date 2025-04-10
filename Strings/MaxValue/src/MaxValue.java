//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MaxValue {
    public static void main(String[] args) {
            String[] s = {"00000065","74353","765","98764"};
            String maxString=s[0];
             for (int i = 1; i < s.length; i++) {
                maxString = max(maxString,s[i]);
           }
          System.out.println(maxString);
    }
    public static String max(String a, String b){
        String s=purify(a);        // removing the leading 0s from starting and now the length is small
        String t=purify(b);// removing the leading 0s from starting and now the length is small
        if (s.length()>t.length()) return a;
        if (s.length()<t.length()) return b;
        for (int i = 0; i < a.length(); i++) {
            if (s.charAt(i)!=t.charAt(i)){
                if (s.charAt(i)>t.charAt(i)) return a;
                else return t;
            }
        }
        if (a.length()>=b.length()) return a;
        else return b;
    }
    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!='0') return s.substring(i);
        }
        return s;
    }
}
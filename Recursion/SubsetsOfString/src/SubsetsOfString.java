import java.util.ArrayList;

public class SubsetsOfString {
    static ArrayList<String> arr = new ArrayList<>();
    public static void subsets(int i, String s1, String s2){
        if (i==s1.length()){
            //System.out.println(s2);
            arr.add(s2);
            return;
        }
        subsets(i+1,s1,s2+s1.charAt(i));
        subsets(i+1,s1,s2);
    }
    public static void main(String[] args) {
        String s1 = "abc"; String s2 = " ";
        subsets(0,s1,s2);
        System.out.println(arr);
    }
}
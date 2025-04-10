import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A STRING:");
        String str = sc.nextLine();
        int n = str.length();
        int count =0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(isVowel(ch)==true) count++;
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )return true;
        return false;
    }
}
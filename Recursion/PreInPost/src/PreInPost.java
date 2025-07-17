//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PreInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.print("pre "+ n+" "); //pre
        pip(n-1);
        System.out.print("in "+ n+" "); //in
        pip(n-1);
        System.out.print("post "+ n+" ");  //post
    }
    public static void main(String[] args) {
        pip(3);
    }
}
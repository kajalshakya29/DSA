package Practice;

public class ProductArray {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6}};
        int pro=1;
        int m= arr.length;
        int n= arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pro*=arr[i][j];
            }
        }
        System.out.println(pro);
    }
}

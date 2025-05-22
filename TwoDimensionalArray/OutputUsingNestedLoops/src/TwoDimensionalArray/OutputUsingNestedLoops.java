package TwoDimensionalArray;

import java.util.Scanner;

public class OutputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr= new int[3][3];
        int m = arr.length;
        int n = arr[0].length;
        System.out.println(m);
        System.out.println(n);

        //i/p
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //o/p
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class WavePrintMatrix {
    public static void print(int[][]arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        int n = arr[0].length;
        print(arr);
        //wave print
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < m; j++) {
//                int a=0, b=m-1;
//                if (i%2!=0) {
//                    while (a < b) {
//                        int temp = arr[i][a];
//                        arr[i][a] = arr[i][b];
//                        arr[i][b] = temp;
//                        a++;
//                        b--;
//
//                    }
//
//                }
//                System.out.print(arr[i][j]+ " ");
//
//            }
//
//        }
        for (int i = 0; i < m; i++) {
            if (i%2==0){
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                    
                }
            }
            else {
                for (int j = n-1 ; j >=0; j--) {
                    System.out.print(arr[i][j] + " ");
                }

            }

        }

    }
}
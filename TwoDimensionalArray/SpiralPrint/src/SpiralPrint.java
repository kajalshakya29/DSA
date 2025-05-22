public class SpiralPrint {
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
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int m = arr.length, n = arr[0].length;
        print(arr);
        int minr = 0, maxr = m - 1, minc = 0, maxc = n - 1;  //for Spiral print
        while (minr <= maxr && minc <= maxc) {
            for (int j = minc; j <= maxc; j++) { //left to right
                System.out.print(arr[minr][j] + " ");
            }
            minr++;
            if (minr > maxr || minc > maxc) break;
            for (int i = minr; i <= maxr; i++) { //top to bottom
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;
            if (minr > maxr || minc > maxc) break;
            for (int j = maxc; j >= minc; j--) {//right to left
                System.out.print(arr[maxr][j] + " ");
            }
            maxr--;
            if (minr > maxr || minc > maxc) break;
            for (int i = maxr; i >= minr; i--) {//bottom to top
                System.out.print(arr[i][minc] + " ");
            }
            minc++;
        }
    }
}
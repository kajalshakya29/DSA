
public class BasicDeclaration {
    public static void main(String[] args) {
       int[][] grid = new int[3][3];
       grid[0][0]=10;
       grid[0][1]=20;
       grid[0][2]=30;
       grid[1][0]=40;
       grid[1][1]=50;
       grid[1][2]=60;
       grid[2][0]=70;
       grid[2][1]=80;
       grid[2][2]=90;
        System.out.println(grid[0][2]);
        System.out.println(grid[2][2]);
    }
}
import java.util.Scanner;
public class MarksAndRollNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] data = new int[4][2];
        System.out.println("Enter 4 pairs of marks and roll numbers (marks rollNo):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                data[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
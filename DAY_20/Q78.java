package DAY_20;

import java.util.Scanner;

public class Q78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row :: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of column :: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        int[][] trans_mtx = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element in matrix1 :: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                trans_mtx[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if(matrix[i][j] != trans_mtx[i][j]) System.out.print("Not a Symmetric matrix");
                return;
            }
        }

        System.out.print("Its a Symmetric matrix");
    }
}

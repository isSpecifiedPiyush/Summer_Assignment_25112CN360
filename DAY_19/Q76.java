package DAY_19;

import java.util.*;

public class Q76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row :: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of column :: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        int diagonal_sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element in matrix1 :: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        int i = 0, j = 0;

        while(i < matrix.length && j < matrix.length) {
            diagonal_sum += matrix[i++][j++];
        }

        System.out.print("Diagonal sum is :: " + diagonal_sum);
    }
}

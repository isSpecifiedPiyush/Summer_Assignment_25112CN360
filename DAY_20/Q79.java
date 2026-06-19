package DAY_20;

import java.util.*;

public class Q79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row :: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of column :: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element in matrix1 :: ");
                matrix[i][j] = sc.nextInt();
            }
        } 

        for(int i = 0; i < row; i++) {
            int sum = 0;
            for(int j = 0; j < col; j++) {
                sum += matrix[i][j];
            }
            System.out.println("The sum of " + i+1  +"st row is :: " + sum);
        }
    }
}

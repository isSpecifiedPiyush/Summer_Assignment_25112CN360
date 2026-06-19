package DAY_19;

import java.util.*;

public class Q73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size :: ");
        int row = sc.nextInt();

        System.out.print("Enter the column size :: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print("Enter the element in idx :: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

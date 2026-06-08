package DAY_10;

import java.util.*;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alpha[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        System.out.print("Enter the number of row to print character triangle :: ");
        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++) {
            int k = -1;
            
            for(int j = num; j > i; j --) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(alpha[++k] + " ");
            }
            for(int j = 1; j < i; j++) {
                System.out.print(alpha[--k] + " ");
            }
            System.out.println();
        }
    }
}

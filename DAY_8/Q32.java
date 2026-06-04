package DAY_8;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which number triangle is to printed :: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            int x = i;

            for(int j = 0; j < i; j++) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

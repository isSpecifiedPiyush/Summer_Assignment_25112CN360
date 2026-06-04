package DAY_8;

import java.util.*;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String alpha[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        System.out.print("Enter the number of which Alphabetical Pyramid is to be Printed :: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(alpha[j] + " ");
            }
            System.out.println();
        }
    }
}

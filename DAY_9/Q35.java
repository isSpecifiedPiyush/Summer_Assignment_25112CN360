package DAY_9;

import java.util.*;

public class Q35 {
    public static void main(String[] args) {
        
        String alpha[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows to print repeated character pattern :: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            for(int j = -1; j < i; j++) {
                System.out.print(alpha[i] + " ");
            }
            System.out.println();
        }
    }
}

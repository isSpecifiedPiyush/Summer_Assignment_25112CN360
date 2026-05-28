package DAY_3;

import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which Prime condition is to be cheaked :: ");
        int num = sc.nextInt();

        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                System.out.print("Not a Prime number");
                return;
            }
        }

        System.out.print("The number Entered is Prime number");

    }
}

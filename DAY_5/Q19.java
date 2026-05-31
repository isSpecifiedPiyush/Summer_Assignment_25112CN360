package DAY_5;

import java.util.*;

public class Q19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which Factors is to be Printed :: ");
        int num = sc.nextInt();

        for(int i = 1; i * i <= num; i++) {
            if(num % i == 0) {
                System.out.print(i + " ");
                if(i != num / i) {
                    System.out.print(num / i + " ");
                }
            }
        }
    }
}

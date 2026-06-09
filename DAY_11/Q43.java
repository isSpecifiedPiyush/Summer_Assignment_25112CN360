package DAY_11;

import java.util.*;

public class Q43 {
    
    public static boolean isPrime(int x) {
        for(int i = 2; i * i <= x ; i ++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to cheak wheather prime or not :: ");
        int num = sc.nextInt();

        if(isPrime(num) == true) {
            System.out.print("The number is Prime");
        } else {
            System.out.print("Not a Prime number");
        }
    }
}

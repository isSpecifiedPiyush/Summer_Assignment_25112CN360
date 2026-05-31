package DAY_5;

import java.util.*;

public class Q20 {

    public static int LargestPrime(int x) {
        int largest = 0;

        while(x % 2 == 0) {
            largest = 2;
            x /= 2;
        }

        for(int i = 3; i * i <= x; i += 2) {
            if(x % i == 0) {
                largest = i;
                x /= i;
            }
        }

        if(largest > 2) {
            largest = x;
        }

        return largest;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which highest common prime factor is to Finded :: ");
        int num = sc.nextInt();

        System.out.print("The largest Prime factor of number " + num + " is :: " + LargestPrime(num));
    }
}

package DAY_6;

import java.util.*;

public class Q22 {

    public static int Digits(int x) {
        int count = 0;

        while(x != 0) {
           count ++;
           x /= 10; 
        }
        return count;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number :: ");
        int bin_num = sc.nextInt() , Decimal = 0;

        int Digit = Digits(bin_num);

        for(int i = 0; i <= Digit - 1; i++) {
            if(bin_num % 10 != 0 && bin_num % 10 != 1) {
                System.out.print("Invalid Input");
                return;
            }
            Decimal += Math.pow(2 , i) * (bin_num % 10);
            bin_num /= 10;
        }
        System.out.print(Decimal);
    }
}

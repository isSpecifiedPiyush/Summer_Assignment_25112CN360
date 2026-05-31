package DAY_6;

import java.util.*;

public class Q21 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Decimal number which is to be converted to Binary :: ");
        int num = sc.nextInt();

        String binary = "";

        if(num == 0) {
            System.out.print(binary = "0");
            return;
        } else {
            while(num > 0) {
                int remainder = num % 2;
                binary = remainder + binary;
                num /= 2; 
            }
        }
        System.out.print("Binary of number is :: " + binary);
    }
}

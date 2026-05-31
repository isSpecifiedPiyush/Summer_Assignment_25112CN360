package DAY_6;

import java.util.*;

public class Q24 {

    public static int XPowerN(int Number , int Power) {
        int product = 1;
        
        if(Power == 0) {
            return 1;
        } else {
            for(int i = 1; i <= Power; i++) {
                product *= Number;
            }
        }

        return product;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of which power is to calculated :: ");
        int num = sc.nextInt();

        System.out.print("Enter the Power of number :: ");
        int power = sc.nextInt();

        System.out.print("The x^n of number is :: " + XPowerN(num, power));
    }
}

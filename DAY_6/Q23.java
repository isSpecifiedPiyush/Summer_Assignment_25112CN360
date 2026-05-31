package DAY_6;

import java.util.*;

public class Q23 {

    public static int NumberOfBit(int Binary) {
        int count = 0;

        while(Binary != 0) {
            if(Binary % 10 == 1) {
                count++;
            } else if(Binary % 10 != 0 && Binary % 10 != 1) {
                return 0;
            }
            Binary /= 10;
        } 

        return count;
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Binary number of which Set Bits is to be counted :: ");
        int Bin_num = sc.nextInt() , cheak = NumberOfBit(Bin_num);

        if(cheak != 0) {
            System.out.print("Number of bits is :: " + cheak);
        } else {
            System.out.print("Invalid input");
        }
    }
}

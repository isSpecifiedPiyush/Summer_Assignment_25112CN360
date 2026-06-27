package DAY_26;

import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = 25;
        int guess;

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too High!");
            } else if (guess < number) {
                System.out.println("Too Low!");
            }

        } while (guess != number);

        System.out.println("Congratulations! You guessed it.");
    }
}

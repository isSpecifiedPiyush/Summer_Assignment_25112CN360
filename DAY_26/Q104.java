package DAY_26;

import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===> Quiz Application <===");

        System.out.println("1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Kolkata");
        System.out.print("Answer: ");
        String ans1 = sc.next();

        ans1 = ans1.toUpperCase();
        

        if (ans1.charAt(0) == 'B') {
            score++;
        }

        System.out.println("\n2. How many days are there in a week?");
        System.out.println("a) 5");
        System.out.println("b) 6");
        System.out.println("c) 7");
        System.out.print("Answer: ");
        String ans2 = sc.next();

        ans2 = ans2.toUpperCase();

        if (ans2.charAt(0) == 'C') {
            score++;
        }

        System.out.println("\n3. Which language is used for Android development?");
        System.out.println("a) Java");
        System.out.println("b) HTML");
        System.out.println("c) CSS");
        System.out.print("Answer: ");
        String ans3 = sc.next();

        ans3 = ans3.toUpperCase();

        if (ans3.charAt(0) == 'A') {
            score++;
        }

        System.out.println("\nYour Score: " + score + "/3");

    }
}

package DAY_28;

import java.util.*;

class Ticket {
    String custumername;
    int totalticket = 10;
    int booked = 0;

    Ticket(String name) {
        this.custumername = name;
    }
    
    void BookTicket(int seat) {
        if(seat <= (totalticket - booked)) {
            booked += seat;
            System.out.print("Added Sucessfully");
        } else {
            System.out.print("Seats are not available");
        }
    }

    void CancelTicket(int seat) {
        if(seat <= booked) {
            booked -= seat;
            System.out.print("Canceled sucessfully");
        } else {
            System.out.print("Invalid seats entered");
        }
    }

    void Display() {
        System.out.println("-----> TICKET DETAILS <-----");
        System.out.println("Name :: " + custumername);
        System.out.println("Tickets :: " + booked);
        System.out.println("AVAILABLE :: " + (totalticket - booked));
    }
}

public class Q111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        Ticket ticket = new Ticket(name);

        int choice;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Number of Seats: ");
                    int book = sc.nextInt();
                    ticket.BookTicket(book);
                    break;

                case 2:
                    System.out.print("Enter Number of Seats to Cancel: ");
                    int cancel = sc.nextInt();
                    ticket.CancelTicket(cancel);
                    break;

                case 3:
                    ticket.Display();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);
    }
}

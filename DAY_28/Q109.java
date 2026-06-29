package DAY_28;

import java.util.*;

class Book {
    int id;
    String name;
    String author;
    boolean issued;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.issued = false;
    }

    void display() {
        System.out.println("----------------------------");
        System.out.println("Book ID   : " + id);
        System.out.println("Book Name : " + name);
        System.out.println("Author    : " + author);
        System.out.println("Status    : " + (issued ? "Issued" : "Available"));
    }
}

public class Q109 {

    static ArrayList<Book> library = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addBook() {

        System.out.print("Enter Book ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name : ");
        String author = sc.nextLine();

        library.add(new Book(id, name, author));

        System.out.println("Book Added Successfully.");
    }

    public static void viewBooks() {

        if (library.size() == 0) {
            System.out.println("No Books Available.");
            return;
        }

        for (Book b : library) {
            b.display();
        }
    }

    public static void issueBook() {

        System.out.print("Enter Book ID to Issue : ");
        int id = sc.nextInt();

        for (Book b : library) {

            if (b.id == id) {

                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book Issued Successfully.");
                } else {
                    System.out.println("Book Already Issued.");
                }

                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void returnBook() {

        System.out.print("Enter Book ID to Return : ");
        int id = sc.nextInt();

        for (Book b : library) {

            if (b.id == id) {

                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book was not Issued.");
                }

                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void removeBook() {

        System.out.print("Enter Book ID to Remove : ");
        int id = sc.nextInt();

        for (int i = 0; i < library.size(); i++) {

            if (library.get(i).id == id) {
                library.remove(i);
                System.out.println("Book Removed Successfully.");
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Remove Book");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    viewBooks();
                    break;

                case 3:
                    issueBook();
                    break;

                case 4:
                    returnBook();
                    break;

                case 5:
                    removeBook();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);
    }
}

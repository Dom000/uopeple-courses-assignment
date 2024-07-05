package Control_structure;
import java.util.Scanner;

public class Unit2_assignment {


    private static String[] titles = new String[100];
    private static String[] authors = new String[100];
    private static int[] quantities = new int[100];
    private static int bookCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nLibrary System Menu:");
            System.out.println("1. Add Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        addBooks();
                        break;
                    case "2":
                        borrowBooks();
                        break;
                    case "3":
                        returnBooks();
                        break;
                    case "4":
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void addBooks() {
        try {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter book author: ");
            String author = scanner.nextLine();
            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            int index = findBook(title);
            if (index != -1) {
                quantities[index] += quantity;
                System.out.println("Book quantity updated.");
            } else {
                if (bookCount < titles.length) {
                    titles[bookCount] = title;
                    authors[bookCount] = author;
                    quantities[bookCount] = quantity;
                    bookCount++;
                    System.out.println("Book added to the library.");
                } else {
                    System.out.println("Library is full. Cannot add more books.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An error occurred while adding books: " + e.getMessage());
        }
    }

    private static void borrowBooks() {
        try {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter quantity to borrow: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            int index = findBook(title);
            if (index != -1) {
                if (quantities[index] >= quantity) {
                    quantities[index] -= quantity;
                    System.out.println("You have successfully borrowed " + quantity + " copies of " + title + ".");
                } else {
                    System.out.println("Not enough copies available. Only " + quantities[index] + " copies left.");
                }
            } else {
                System.out.println("Book not available in the library.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An error occurred while borrowing books: " + e.getMessage());
        }
    }

    private static void returnBooks() {
        try {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter quantity to return: ");
            int quantity = Integer.parseInt(scanner.nextLine());

            int index = findBook(title);
            if (index != -1) {
                quantities[index] += quantity;
                System.out.println("You have successfully returned " + quantity + " copies of " + title + ".");
            } else {
                System.out.println("This book does not belong to our library.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An error occurred while returning books: " + e.getMessage());
        }
    }

    private static int findBook(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (titles[i].equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }


}



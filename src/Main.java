import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Library library = new Library();
    private static Registration reg = new Registration();
    private static boolean flag = true;

    public static void main(String[] args){
        while(true){
            menu();
            switchCase();
        }
    }
    private static void issueBook(){
        System.out.print("Enter the Book id: ");
        String bookId = scanner.nextLine();

        System.out.print("Enter the User id: ");
        String userId = scanner.nextLine();

        library.issueBook(bookId, userId);
        System.out.println("Book issued Successfully");
    }
    private static void returnBook(){
        System.out.print("Enter the Book id: ");
        String bookId = scanner.nextLine();

        System.out.print("Enter the User id: ");
        String userId = scanner.nextLine();

        library.returnBook(bookId, userId);
        System.out.println("User returned the book.");
    }
    private static void menu(){
        System.out.println("\n===== Library Menu =====");
        System.out.println("1. Add Book");
        System.out.println("2. Add User");
        System.out.println("3. Issue Book");
        System.out.println("4. Return Book");
        System.out.println("5. Show Books");
        System.out.println("6. Show User");
        System.out.println("7. Exit");
        System.out.print("Choose an option: ");
    }
    private static void switchCase(){
        int option = scanner.nextInt();
        scanner.nextLine();
        switch(option){
            case 1:
                reg.registerNewBook();
                break;
            case 2:
                reg.registerNewUser();
                break;
            case 3:
                issueBook();
                break;
            case 4:
                returnBook();
                break;
            case 5:
                library.displayAllBooks();
                break;
            case 6:
                library.displayAllUsers();
                break;
            case 7:
                flag = false;
                System.out.println("Bye! \n Have a nice Reading..!");
                break;
            default:
                System.out.println("Incorrect option");
                break;
        }
    }
}
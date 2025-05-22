public class Registration {

    public void registerNewUser(){
        System.out.print("Enter the user id:");
        String id = Main.scanner.nextLine();

        System.out.print("Enter the user name:");
        String name = Main.scanner.nextLine();

        System.out.print("Enter the user department:");
        String department = Main.scanner.nextLine();

        Main.library.addUser(new User(id, name, department));
        System.out.println("User added successfully");

    }
    public void registerNewBook(){
        System.out.print("Enter the book id: ");
        String id = Main.scanner.nextLine();


        System.out.print("Enter the book title: ");
        String title = Main.scanner.nextLine();

        System.out.print("Enter the author name: ");
        String author = Main.scanner.nextLine();

        Main.library.addBook(new Book(id, title, author));
        System.out.println("Book added successfully");

    }
}

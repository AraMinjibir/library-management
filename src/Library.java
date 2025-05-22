import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books;
    private HashMap<String, User> users;

    public Library() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }
    public void addUser(User user) {
        users.put(user.getId(), user);
    }

    public boolean issueBook(String bookId, String userId) {
        Book book = books.get(bookId);
        User user = users.get(userId);

        if (book != null && user != null && !book.isIssued()) {
            book.issueBook();
            user.borrowbook(book);
            return true;
        }
        return false;
    }
    public boolean returnBook(String bookId, String userId) {
        Book book = books.get(bookId);
        User user = users.get(userId);

        if (book != null && user != null && book.isIssued()) {
            book.returnBook();
            user.returnBook(book);
            return true;
        }
        return false;
    }

    public void displayAllBooks() {
        for (Book book : books.values()) {
            System.out.print(book.getId() + "|" + book.getTitle() + "|" + book.getAuthor());
            if (book.isIssued()) {
                System.out.println("| ISSUED | Due: " + book.getDueDate());
            } else {
                System.out.println("| Available");
            }
        }
    }
    public void displayAllUsers() {
        if (users.isEmpty()) {
            System.out.println("No users in the system.");
            return;
        }
        for (User user : users.values()) {
            System.out.println(user.getId() + "|" + user.getName() + "|" + user.getDepartment() + "|" + user.getBorrowedBooks().size());
        }
        System.out.println("Total users: " + users.size());
    }
}

import java.util.ArrayList;

public class User {
    private String id;
    private String name;
    private String department;
    private ArrayList<Book> borrowedBooks;


    public User(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowbook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    private void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getDepartment() {
        return department;
    }
    private void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    private void setId(String id) {
        this.id = id;
    }
}

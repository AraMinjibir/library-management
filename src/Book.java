import java.time.LocalDate;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean issued;
    private LocalDate issueDate;
    private LocalDate dueDate;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }
    public boolean isIssued() {
        return issued;
    }
    public void issueBook() {
        this.issued = true;
        this.issueDate = LocalDate.now();
        this.dueDate = issueDate.plusDays(7);
    }
    public void returnBook() {
        this.issued = false;
        this.issueDate = null;
        this.dueDate = null;
    }

    public String getId() {
        return id;
    }
    private void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    private void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    private void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

}

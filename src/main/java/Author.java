import java.util.ArrayList;

public class Author {

    private String firstName;
    private String lastName;
    private ArrayList<Book> books;

    public Author (String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    public Author (String fName, String lName, ArrayList<Book> b) {
        this.firstName = fName;
        this.lastName = lName;
        this.books = b;
    }

    private String getFirstName() {
        return this.firstName;
    }

    private void setFirstName(String fName) {
        this.firstName = fName;
    }

    private String getLastName() {
        return this.firstName;
    }

    private void setLastName(String lName) {
        this.lastName = lName;
    }

    private ArrayList<Book> getBookCollection() {
        return this.books;
    }

    public void addBookToCollection(Book b) {
        books.add(b);
    }

    public String getAuthorFullName() {
        return firstName + " " + lastName;
    }


}

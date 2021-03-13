import java.util.Date;
import java.util.ArrayList;

public class Book {

    private String title;
    private String isbnNumber;
    private Date publishedDate;
    private ArrayList<Author> authors;

    public Book(String title, String isbnNumber, Date publishedDate, ArrayList<Author> authors) {
        this.title = title;
        this.isbnNumber = isbnNumber;
        this.publishedDate = publishedDate;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

}

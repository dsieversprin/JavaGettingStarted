import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class WeekThreeExercisesPartOne {
   // class visibility
   // static variables vs. instance variables
   // getters
   // setters
   // methods
   // constructors
   // access modifiers modifiers (public, protected, private, none) (

//    Access Levels
//    Modifier	Class	Package	Subclass	World
//    public	Y	Y	Y	Y
//    protected	Y	Y	Y	N
//    no modifier	Y	Y	N	N
//    private	Y	N	N	N

    // subclass vs superclass
    // using the final keyword

    // arrays
    // pass by value vs reference

    // incrementally build out a solution using exercises


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String authorFirstName, authorLastName, songWriterFirstName, songWriterLastName, bookTitle, isbnNumber, pubDate;
        int pubYear, pubMonth, pubDay;
        Date bookPubDate;
        Book[] books = new Book[10];
        boolean createBooks = true;
        String answer = "";

        System.out.println("Enter Author's first name.");
        authorFirstName = in.nextLine();

        System.out.println("Enter Author's last name.");
        authorLastName = in.nextLine();

        Author author1 = new Author(authorFirstName, authorLastName);
        ArrayList<Author> authors = new ArrayList<Author>();

        authors.add(author1);
        while(createBooks) {
            System.out.println("Add a book for the author " + author1.getAuthorFullName() + "? (y/n)");
            answer = in.nextLine();
            if (answer.substring(0,1).equalsIgnoreCase("y")) {
                System.out.println("Enter the book title.");
                bookTitle = in.nextLine();
                System.out.println("Enter the ISBN Number.");
                isbnNumber = in.nextLine();
                System.out.println("Enter the year the book was published. (4 digits)");
                pubYear = in.nextInt();
                System.out.println("Enter the month the book was published. (2 digits");
                pubMonth = in.nextInt();
                System.out.println("Enter the day the book was published. (2 digits)");
                pubDay = in.nextInt();
                bookPubDate = new Date(pubYear, pubMonth, pubDay);
                author1.addBookToCollection(new Book(bookTitle,isbnNumber,bookPubDate,authors));
            } else {
                createBooks = false;
            }
        }


    }

}

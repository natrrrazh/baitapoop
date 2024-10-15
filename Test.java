

class LibraryItem {
    String title;
    int yearPulished;
    public LibraryItem(String title, int yearPulished) {
        this.title = title;
        this.yearPulished = yearPulished;
    }
    public void getDetails() {
        System.out.println("Title: " + title + ", yearPulished: " + yearPulished);

    }
}
class Book extends LibraryItem {
    String Author;
    String isbn;
    public Book(String title, int yearPulished , String Author, String isbn) {
        super(title,yearPulished);
        this.Author = Author;
        this.isbn = isbn;
    }

    @Override
    public void getDetails() {
        super.getDetails();  // prints the title and yearPublished
        String author = "";
        System.out.println("Author: " + author + ", ISBN: " + isbn);
    }
}
class Magazine extends LibraryItem {
    int issueNumber;
    String publisher;
    public Magazine(String title, int yearPublished, int issueNumber, String publisher) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }
    @Override
    public void getDetails() {
        super.getDetails();  // prints the title and yearPublished
        System.out.println("Issue Number: " + issueNumber + ", Publisher: " + publisher);
    }
}
public class Test {
    private static int yearPublished;

    public static void main(String[]args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("Java Programming", 2020, "John Doe", "12345");
        items[1] = new Magazine("Tech Monthly", 2023, 5, "Tech Publishers");
        items[2] = new Book ("Effective C++", 2019, "Scott Meyers", "54321");
        for(LibraryItem item : items) {
            item.getDetails();
            System.out.println();
        }
    }
}

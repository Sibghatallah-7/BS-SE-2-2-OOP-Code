class Libraryitem {
    protected String title;
    protected String author;
    protected int publicationyear;

    public Libraryitem(String title, String author, int publicationyear) {
        this.title = title;
        this.author = author;
        this.publicationyear = publicationyear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Published: " + publicationyear);
    }
}

class Book extends Libraryitem {
    protected String ISBN;
    protected int numberofpages;

    public Book(String title, String author, int publicationYear, String ISBN, int numberofpages) {
        super(title, author, publicationYear);
        this.ISBN = ISBN;
        this.numberofpages = numberofpages;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Pages: " + numberofpages);
    }
}

class Magazine extends Libraryitem {
    private int issueNumber;
    private String month;
    private String editor;

    public Magazine(String title, String author, int publicationYear, int issueNumber, String month, String editor) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
        this.month = month;
        this.editor = editor;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue No: " + issueNumber);
        System.out.println("Month: " + month);
        System.out.println("Editor: " + editor);
    }
}

class ReferenceBook extends Book {
    private String fieldofstudy;
    private boolean isLendable;

    public ReferenceBook(String title, String author, int publicationYear, String ISBN, int numberOfPages,
                         String fieldOfStudy, boolean isLendable) {
        super(title, author, publicationYear, ISBN, numberOfPages);
        this.fieldofstudy = fieldOfStudy;
        this.isLendable = isLendable;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Field: " + fieldofstudy);
        System.out.println("Lendable: " + (isLendable ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Libraryitem book = new Book("The Fireflies", "Abdullah", 1947, "9780061122415", 500);
        Libraryitem magazine = new Magazine("New Time", "Ahmed", 1987, 25, "April", "Bilal");
        Libraryitem refBook = new ReferenceBook("Bange Dara", "Iqbal", 2000,
                "9780199233171", 1100, "Urdu", true);

        System.out.println("-----Book Info------");
        book.displayInfo();

        System.out.println("\n-----Magazine Info------");
        magazine.displayInfo();

        System.out.println("\n------Reference Book Info------");
        refBook.displayInfo();
    }
}

package fr.ensai.library;

/**
 * Represents a book.
 */
public class Magazine extends Item {

    // Attributes
    private String issn;
    private String issueNumber;

    /**
     * Constructs a new Book object.
     */
    public Book(String issn, String title, String issueNumber, int year, int pageCount) {
        super(title, year, pageCount);
        this.isbn = issn;
        this.issueNumber = issueNumber;
    }


    @Override
    public String toString() {
        return "Magazine " + title;
    }

}

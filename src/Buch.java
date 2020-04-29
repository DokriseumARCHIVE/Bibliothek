public class Buch {
    private String title; //title from book
    private String author; //authors in a list
    private String publicationYear; //for the year of the publication

    /**
     * the constructor from the class Buch
     *
     * @param title           is the title from the book
     * @param author          is an string, which contains the authors by pre- and lastname
     * @param publicationYear is from class string and contains the publication year from the book
     */
    public Buch(String title, String author, String publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        ;
    }

    /**
     * method, which gets the variable title from Buch
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * method, which sets the title of a book
     *
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * method, which gets out a list of authors from the book
     *
     * @return the author(-s)
     */
    public String getAuthor() {
        return author;
    }

    /**
     * method, which sets a list with authors for the book
     *
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * method, which gets out the year of publication
     *
     * @return the publication year
     */
    @SuppressWarnings("deprecation")
    public String getPublicationYear() {
        return publicationYear;
    }

    /**
     * method, which sets the year of publication
     *
     * @param publicationYear the publication year to set
     */
    @SuppressWarnings("deprecation")
    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    /**
     * method, which gets the book as a string
     *
     * @return author, title, publication year from a book
     */
    @Override
    public String toString() {
        return author + ": " + title + ", " + publicationYear;
    }
}

public class Book {
    protected String bookID;
    protected String title;
    protected String author;
    protected String genre;
    protected int publishingYear;



    public Book() {
    }
    public Book(String bookID, String title, String author, String genre, int publishingYear) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publishingYear = publishingYear;
    }


    public String getBookID() {
        return bookID;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getPublishingYear() {
        return publishingYear;
    }


    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }


    @Override
    public String toString() {
        return "Book{" +
                "bookID='" + bookID + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publishingYear=" + publishingYear +
                '}';
    }
}

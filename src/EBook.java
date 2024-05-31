public class EBook extends Book {

    private int fileSize;
    private String fileFormat;

public EBook(){
}
    public EBook(int fileSize, String fileFormat) {
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }
    public EBook(String bookID, String title, String author, String genre, int publishingYear, int fileSize, String fileFormat) {
        super(bookID, title, author, genre, publishingYear);
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;


    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    @Override
    public String toString() {
        return "EBook[ " +

                " bookID= " + bookID  +
                ", title= " + title +
                ", author= " + author +
                ", genre= " + genre +
                ", publishingYear= " + publishingYear +
                ", fileFormat= "  + fileFormat +
                ", filesize = " + fileSize + "]";

    }

}

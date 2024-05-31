import java.util.Scanner;

public class Library {

    protected int size = 0;
    public EBook[] saveBook = new EBook[size];


    public void menu() {
        System.out.println("1. Thêm một sách điện tử mới vào thư viện.");
        System.out.println("2. Cập nhật thông tin của một sách điện tử dựa trên mã sách.");
        System.out.println("3. Xóa một sách điện tử dựa trên mã sách.");
        System.out.println("4. Sắp xếp danh sách sách điện tử theo năm xuất bản.");
        System.out.println("5. Tìm kiếm sách điện tử dựa trên mã sách.");
        System.out.println("6. Tìm kiếm sách điện tử dựa trên tiêu đề sách. ");
        System.out.println("<---------------------------------------------------------------->");
    }

    public EBook[] update(String maID, String title, String author, String genre, int publishingYear, String fileFormat, int fileSize) {
        for (int i = 0; i < saveBook.length; i++) {
            if (saveBook[i].getBookID().equalsIgnoreCase(maID)) {
                saveBook[i].setTitle(title);
                saveBook[i].setAuthor(author);
                saveBook[i].setGenre(genre);
                saveBook[i].setPublishingYear(publishingYear);
                saveBook[i].setFileSize(fileSize);
                saveBook[i].setFileFormat(fileFormat);
            }
        }
        return saveBook;
    }


    public EBook[] addProduct(EBook eBook) {
        EBook[] newSaveBook = new EBook[saveBook.length + 1];
        for (int i = 0; i < saveBook.length; i++) {
            newSaveBook[i] = saveBook[i];
        }
        saveBook = newSaveBook;
        saveBook[size] = eBook;
        size++;
        return saveBook;
    }




    public EBook[] deletePro(String IDXoa) {
        int count = 0;
        for (int i = 0; i < saveBook.length; i++) {
            if (!saveBook[i].getBookID().equalsIgnoreCase(IDXoa)) {
                count++;
            }
        }

        EBook[] newSave = new EBook[count];
        int index = 0;
        for (int i = 0; i < saveBook.length; i++) {
            if (!saveBook[i].getBookID().equalsIgnoreCase(IDXoa)) {
                newSave[index++] = saveBook[i];
            }
        }
        saveBook = newSave;
        return saveBook;

    }


    public EBook[] sortYearSmallToBig() {
        for (int i = 0; i < saveBook.length - 1; i++) {
            for (int j = 0; j < saveBook.length - i - 1; j++) {
                if (saveBook[j].getPublishingYear() > saveBook[j + 1].getPublishingYear()) {
                    EBook temp = saveBook[j];
                    saveBook[j] = saveBook[j + 1];
                    saveBook[j + 1] = temp;

                }
            }
        }
        return saveBook;
    }

    public void searchByID(String maSach) {
        for (int i = 0; i < saveBook.length; i++) {
            if (saveBook[i].getBookID().equalsIgnoreCase(maSach)) {
                System.out.println( saveBook[i]);
            }
        }

    }


    public void searchByTitle(String tieuDe) {
        for (int j = 0; j < saveBook.length; j++) {
            if (saveBook[j].getTitle().equalsIgnoreCase(tieuDe)) {
                System.out.println( saveBook[j]);
            }
        }

    }

    public void showPro() {
        for (EBook i : saveBook) {
                System.out.println(i);
        }

    }


}

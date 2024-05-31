import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        EBook eBook = new EBook();
        while (true) {

            library.menu();
            System.out.println("Mời bạn chọn menu.");
            int number = scanner.nextInt();
            if (number == 1) {

                System.out.println("Mời nhập mã của sách cần thêm.");
                String ma = new Scanner(System.in).nextLine();

                System.out.println("Bi trung ma roi.");

                System.out.println("------> Nhập tiêu đề cho sách.");
                String tieuDe = new Scanner(System.in).nextLine();
                System.out.println("------> Nhập tác giả cho sách.");
                String tacGia = new Scanner(System.in).nextLine();
                System.out.println("------> Nhập thể loại cho sách.");
                String theLoai = new Scanner(System.in).nextLine();
                System.out.println("------> Nhập năm xuất bản của sách.");
                int namXuatBan = new Scanner(System.in).nextInt();
                System.out.println("------> Nhập định dạng tệp.");
                String dinhDangTep = new Scanner(System.in).nextLine();
                System.out.println("------> Nhập kích thước của tệp.");
                int kichThuocTep = new Scanner(System.in).nextInt();
                library.addProduct(new EBook(ma, tieuDe, tacGia, theLoai, namXuatBan, kichThuocTep, dinhDangTep));

                if (library.size != 0) {
                    System.out.println("Danh sách thư viện của bạn là:");
                    library.showPro();
                } else {
                    System.out.println("Danh sách đang chưa có sản phẩm.");
                }
                System.out.println();


            } else if (number == 2) {

                System.out.println("Mời nhập mã của sách cần thay đổi.");
                String ma1 = new Scanner(System.in).nextLine();
                System.out.println("------> Nhập tiêu đề cho sách.");
                String tieuDe1 = new Scanner(System.in).nextLine();
                System.out.println("------> Nhập tác giả cho sách.");
                String tacGia1 = new Scanner(System.in).nextLine();
                System.out.println("------> Nhập thể loại cho sách.");
                String theLoai1 = new Scanner(System.in).nextLine();
                System.out.println("------> Nhập năm xuất bản của sách.");
                int namXuatBan1 = new Scanner(System.in).nextInt();
                System.out.println("------> Nhập định dạng tệp.");
                String dinhDangTep1 = new Scanner(System.in).nextLine();
                System.out.println("------> Nhập kích thước của tệp.");
                int kichThuocTep1 = new Scanner(System.in).nextInt();
                library.update(ma1, tieuDe1, tacGia1, theLoai1, namXuatBan1, dinhDangTep1, kichThuocTep1);

                if (library.size != 0) {
                    System.out.println("Danh sách thư viện của bạn là:");
                    library.showPro();
                } else {
                    System.out.println("Danh sách đang chưa có sản phẩm.");
                }
                System.out.println();
            } else if (number == 3) {


                System.out.println("Mời nhập mã của sách cần xóa.");
                String ma2 = new Scanner(System.in).nextLine();
                library.deletePro(ma2);

                if (library.size != 0) {
                    System.out.println("Danh sách thư viện của bạn là:");
                    library.showPro();
                } else {
                    System.out.println("Danh sách đang chưa có sản phẩm.");
                }
                System.out.println();
            } else if (number == 4) {


                System.out.println("Danh sách điện tử sau khi được sắp xếp theo năm xuất bản là:");
                library.sortYearSmallToBig();
                library.showPro();

                if (library.size != 0) {
                    System.out.println("Danh sách thư viện của bạn là:");
                    library.showPro();
                } else {
                    System.out.println("Danh sách đang chưa có sản phẩm.");
                }
                System.out.println();
            } else if (number == 5) {


                System.out.println("Mời nhập mã sách để tìm kiếm sách.");
                String ma3 = new Scanner(System.in).nextLine();
                library.searchByID(ma3);

            } else if (number == 6) {


                System.out.println("Mời nhập tiêu đề để tìm kiếm sách.");
                String tieude2 = new Scanner(System.in).nextLine();
                library.searchByTitle(tieude2);

            }
        }

    }

}



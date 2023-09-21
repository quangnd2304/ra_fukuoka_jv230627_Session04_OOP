package ra.oop;

import java.util.Scanner;

public class Book {
    /*
     * 1. Tạo ra lớp Book trong package ra.entity gồm các thông tin sau:
     *  - Các thuộc tính
     *       + bookId - int: Mã sách
     *       + bookName - String: tên sách
     *       + price - float: giá sách
     *       + title - String: tiêu đề sách
     *       + author - String: tác giả sách
     *       + year - int: Năm xuất bản
     *       + status - boolean: trạng thái sách
     *   - Các constructor:
     *       + default constructor
     *       + constructor cho phép khởi tạo tất cả thông tin sách
     *   - Các phương thức
     *       + getter/setter cho tất cả thuộc tính
     *       + phương thức inputData(Scanner scanner): cho phép nhập tất cả thông tin sách
     *       + phương thức displayData(): Cho phép hiển thị các thông tin sách
     *       + phương thức tính tuổi sách: calAge(int currentYear) trả ra số tuổi của sách
     * */
    //1. Attributes-Fields
    //Cú pháp: Access Modifier(private) + Datatype + attributeName;
    //--> tính chất bao đóng (đóng gói)
    private int bookId;
    private String bookName;
    private float price;
    private String title;
    private String author;
    private int year;
    private boolean status;

    //2. Constructors
    //Cú pháp: Access Modifier(public) + ClassName(params){Block Statements};
    //Default Constructor
    //Constructor --> đa hình
    public Book() {
    }

    //All Arguments Constructors
    public Book(int bookId, String bookName, float price, String title, String author, int year, boolean status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
    }

    //3. Methods
    //Cú pháp: Access Modifier + ReturnData + MethodName(params){Block Statements}
    //Cú pháp params: Datatype paramName (,)
    //3.1. Getter/setter
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //3.2. Methods hành vi
    //InputData(Scanner scanner): Nhập dữ liệu sách
    public void inputData(Scanner scanner) {
        System.out.println("Nhập vào mã sách:");
        this.bookId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sách:");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập vào giá sách:");
        this.price = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào tiêu đề sách:");
        this.title = scanner.nextLine();
        System.out.println("Nhập tác giả sách:");
        this.author = scanner.nextLine();
        System.out.println("Nhập năm xuất bản:");
        this.year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trạng thái sách:");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }

    //displayData(): hiển thị thông tin sách
    public void displayData() {
        System.out.printf("Mã sách: %d - Tên sách: %s - Giá sách: %f - tiêu đề: %s\n",
                this.bookId, this.bookName, this.price, this.title);
        System.out.printf("Tác giả: %s - Năm xuất bản: %d - Trạng thái: %b\n",this.author,this.year,this.status);
    }
    //Tính tuổi sách
    public int calAge(int currentYear){
        return currentYear-this.year;
    }
}

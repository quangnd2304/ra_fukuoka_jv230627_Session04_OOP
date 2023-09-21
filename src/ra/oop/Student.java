package ra.oop;

import java.util.Scanner;

public class Student {
    /*
    * Đặc điểm: Mã sinh viên, tên sinh viên, tuổi, giới tính, địa chỉ
    * Hành vi: chào giảng viên, tính tổng 2 số...
    * */
    //1. Attributes/Fields: mô tả đặc điểm của đối tượng
    //Cú pháp: Access Modifier + Datatype + attributeName --> private
    public String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    //2. Constructor: Khởi tạo đối tượng
    //default Constructor
    public Student() {
    }
    //Constructor khởi tạo mã sinh viên và tên sinh viên
    public Student(String studentId, String studentName) {
        //studentId: 1 tham số
        //this.studentId: thuộc tính của lớp
        //this: chỉ ra của lớp này
        this.studentId = studentId;
        this.studentName = studentName;
    }
    //Constructor khởi tạo tất cả thông tin sinh viên
    public Student(String studentId, String studentName, int age, boolean sex, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
    //3. Methods: Phương thức mô tả các hành vi của đối tượng
    //3.1: Getter/Setter Methods: Truy cập các thuộc tính của đối tượng từ bên ngoài
    //get: lấy dữ liệu các thuộc tính
    //set: set giá trị cho các thuộc tính
    //Method: Access Modifier + ReturnData + methodName(params){Block Statements}
    //private: trong cùng lớp mới truy cập được
    //protected, default: trong cùng package mới truy cập được
    //public: ở đâu cũng truy cập được
    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //3.2. Methods mô tả hành vi của đối tượng
    //Hành vi chào giảng viên
    public void hello(){
        System.out.println("Xin chào giảng viên");
    }
    //Hành vi tính tổng 2 số nguyên
    public int add(int number1, int number2){
        int sum = number1+number2;
        return sum;
    }
    //Hành vi cho phép nhập tất cả thông tin sinh viên từ bàn phím
    public void inputData(Scanner scanner){
        System.out.println("Nhập vào mã sinh viên:");
        this.studentId = scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên:");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính sinh viên:");
        this.sex = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ sinh viên:");
        this.address = scanner.nextLine();
    }
    //Hành vi cho phép hiển thị tất cả thông tin sinh viên
    public void displayData(){
        System.out.printf("Mã SV: %s - Tên sinh viên: %s - Tuổi: %d\n",this.studentId,this.studentName,this.age);
        System.out.printf("Giới tính: %b - Địa chỉ: %s\n",this.sex,this.address);
    }

}

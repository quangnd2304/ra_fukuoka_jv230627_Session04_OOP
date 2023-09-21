package ra.oop;

import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) {
        //ClassName objectName = new constructor
        //1. Khai báo và khởi tạo đối tượng sinh viên 1 mà không khởi tạo bất cứ thông tin gì
        Student student1 = new Student();
        //2.Khai báo và khởi tạo đối tượng sinh viên 2 và khởi tạo mã sinh viên và tên sinh viên
        Student student2 = new Student("SV002","Nguyễn Văn B");
        //3. Khai báo và khởi tạo đối tượng sinh viên 3 và khởi tạo tất cả thông tin sinh viên
        Student student3 = new Student("SV003","Nguyễn Văn C",25,true,"Hồ Chí Minh");
        //4. Sử dụng inputData để nhập dữ liệu cho sinh viên 1
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 1:");
        Scanner scanner = new Scanner(System.in);
        student1.inputData(scanner);
        //5. Sử dụng các phương thức set để nhập thông tin tuổi, giới tính, địa chỉ cho sinh viên 2
        System.out.println("NHẬP THÔNG TIN SINH VIÊN 2:");
        System.out.println("Nhập vào tuổi sinh viên 2:");
        student2.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào giới tính sinh viên 2:");
        student2.setSex(Boolean.parseBoolean(scanner.nextLine()));
        System.out.println("Nhập vào địa chỉ sinh viên 2:");
        student2.setAddress(scanner.nextLine());
        //6. Tính năm sinh của sinh viên 3 - Sử dụng phương thức get
        int year = 2023-student3.getAge();
        System.out.println("Tuổi sinh viên 3 là: "+year);
        //Gọi phương thức displayData để hiển thị thông tin các sinh viên
        System.out.println("THÔNG TIN SINH VIÊN 1:");
        student1.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 2:");
        student2.displayData();
        System.out.println("THÔNG TIN SINH VIÊN 3:");
        student3.displayData();
    }
}

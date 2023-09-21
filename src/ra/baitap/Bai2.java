package ra.baitap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Nhập số dòng và số cột của mảng 2 chiều
        System.out.println("Nhập vào số dòng của mảng 2 chiều:");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột của mảng 2 chiều:");
        int col = Integer.parseInt(scanner.nextLine());
        //2. Khởi tạo mảng 2 chiều
        int[][] arrInt = new int[row][col];
        do {
            System.out.println("*****************MENU******************");
            System.out.println("1. Nhập vào giá trị các phần tử");
            System.out.println("2. In giá trị các phần tử");
            System.out.println("3. In các phần tử nằm trên biên và tính tổng");
            System.out.println("4. In ra các phần tử chéo chính, chéo phụ và tính tổng");
            System.out.println("5. In ra giá trị lớn nhất và nhỏ nhất");
            System.out.println("6. Sắp xếp mảng tăng dần theo cột");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    for (int j = 0; j < col; j++) {
                        //Duyệt từng cột
                        for (int i = 0; i < row-1; i++) {
                            //Chạy các phần tử để sắp xếp
                            for (int k = i+1; k < row; k++) {
                                if (arrInt[i][j]>arrInt[k][j]){
                                    int temp = arrInt[i][j];
                                    arrInt[i][j] = arrInt[k][j];
                                    arrInt[k][j] = temp;
                                }
                            }
                        }
                    }
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1-7");
            }
        }while(true);
    }
}

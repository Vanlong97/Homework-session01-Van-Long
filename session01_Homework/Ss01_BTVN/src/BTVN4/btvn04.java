package BTVN4;

import java.util.Scanner;

public class btvn04 {
    public static void main(String[] args) {
        // Khởi tạo biến scanner
        Scanner sc = new Scanner(System.in);
        // Nhập vào điểm môn thứ nhất:
        System.out.println("Nhập vào điểm Toán: ");
        double diem1 = sc.nextDouble();
        // Nhập vào điểm môn thứ hai:
        System.out.println("Nhập vào điểm Văn: ");
        double diem2 = sc.nextDouble();
        // Nhập vào điểm môn thứ ba:
        System.out.println("Nhập vào điểm Anh: ");
        double diem3 = sc.nextDouble();
        // tính điểm trung bình ba môn
        double dtb = (diem1+diem2+diem3)/3;
        // in ra ket qua
        System.out.printf("Điểm trung bình ba môn là: %f ",dtb);
    }
}

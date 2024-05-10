package BTVN3;

import java.util.Scanner;

public class btvn03 {
    public static void main(String[] args) {
      // Khởi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);
        // Nhập vào chiều dài cạnh hình vuông:
        System.out.println("Nhập vào chiều dài cạnh hình vuông:");
        double chieudaicanh = sc.nextInt();
        // tính giá trị chu vi diện tích
        double chuVi= chieudaicanh*4;
        double dienTich= chieudaicanh*chieudaicanh;
        // Hiển thị ra kết quả
        System.out.printf("Chu vi hình vuông là: %f, Diện tích hình vuông là: %f",chuVi,dienTich);
    }
}

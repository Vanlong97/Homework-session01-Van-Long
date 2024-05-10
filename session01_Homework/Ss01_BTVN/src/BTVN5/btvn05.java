package BTVN5;

import java.util.Scanner;

public class btvn05 {
    public static void main(String[] args) {
        // khởi tạo đối tượng scanner
        Scanner sc = new Scanner(System.in);
        // Nhập vào bán kính
        System.out.println("nhập vào bán kính hình tròn");
        double banKinh = sc.nextDouble();
        // Tính chu vi hình tron
        double chuVi = banKinh*2*Math.PI;
        // Tính diện tích hình tron
        double dienTich = Math.PI* banKinh*banKinh;
        System.out.printf("Chu vi hình tròn là:%f, Diện tích hình tròn là: %f",chuVi,dienTich);
    }
}

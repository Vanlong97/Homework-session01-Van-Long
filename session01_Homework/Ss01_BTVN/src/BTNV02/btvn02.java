package BTNV02;
import java.util.Scanner;
public class btvn02 {
    public static void main(String[] args) {
        // Khởi tạo đối tượng scanner để đọc dữ liệu
        Scanner sc = new Scanner(System.in);
        // Nhập vào tỷ giá USD/ VND
        System.out.println("Nhập vào tỷ giá USD/VND: ");
        double tyGia = sc.nextDouble();
        // Nhập vào lượng USD cần đổi
        System.out.println("Nhập vào lượng USD cần đổi: ");
        double usd = sc.nextDouble();
        // Tính giá trị VND
        double vnd = tyGia * usd;
        // Hiển thị ra kết quả
        System.out.printf("%f USD=%fVND",usd,vnd);
    }
}

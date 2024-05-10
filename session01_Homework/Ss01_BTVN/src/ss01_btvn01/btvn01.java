package ss01_btvn01;
import java.util.Scanner;
public class btvn01 {
    public static void main(String[] args) {
     // tạo đối tượng scanner để đọc dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
       // Nhập tên người dùng
        System.out.print("Please input your name:");
        String name = sc.nextLine();
        // Hiển thị lời chào kèm tên người dùng
        System.out.println("Hello, " + name + "!");
    }
}

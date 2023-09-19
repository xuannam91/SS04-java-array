package ra.bt08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Đếm số lần xuất hiện của ký tự trong chuỗi
        Scanner sc = new Scanner(System.in);
        String str = "Hello world ";
        System.out.println("Cho chuỗi:");
        System.out.println(str);
        System.out.print("Nhập vào một ký tự để kiểm tra tần số xuất hiện trong chuỗi trên: ");
        char ch = sc.next().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }


        System.out.println("Ký tự " + ch + " đã xuất hiện " + count+ " lần trong chuỗi.");

    }


}

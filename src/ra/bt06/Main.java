package ra.bt06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Tính tổng các số ở một cột xác định
        // bài toán nhạp xuất dữ liệu mảng 2 chiều.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vao số hàng m =");
        int m = sc.nextInt();
        System.out.println("Nhập vao số cột n =");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        // nhập lần lượt giá trị cho mảng
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("\nNhập giá trị cho matrix[%d][%d]= ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        System.out.println("Nhập vaò số cột cần tính tổng");
        int columnIndex = sc.nextInt();
        for (int i = 0; i< matrix.length; i++){
                sum += matrix[i][columnIndex];
        }
        System.out.println("Sum "+ sum);
    }
}

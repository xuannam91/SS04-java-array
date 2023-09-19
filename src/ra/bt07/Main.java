package ra.bt07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Mảng hai chiều - tính tổng các số ở đường
//          chéo chính của ma trận vuông
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vao số hàng, số cột m =");
        int m = sc.nextInt();

        int[][] matrix = new int[m][m];
        // nhập lần lượt giá trị cho mảng
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("\nNhập giá trị cho matrix[%d][%d]= ",i,j);
                matrix[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i< m; i++){
            sum += matrix[i][i];
        }
        System.out.println("Tổng đường chéo "+ sum);
    }
}

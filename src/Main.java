import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Array: mảng là khái niệm dùng để lưu trữ danh sách các giá trị cùng kiểu dữ liệu.
//        cú pháp: tường minh
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
//        cú pháp: sử dụng new
        int[] arrayInt = new int[10];
        System.out.println(Arrays.toString(arrayInt));
//        truy cập phần tử theo vị trí
        System.out.println("Phần tử tại vị trí index = 0 là " + array[0]);
//        gán lại giá trị
        array[0] = 10;
        System.out.println("Phần tử tại vị trí index = 0 là " + array[0]);

//        duỵet mảng
        for (int i = 0; i < array.length; i++) { // duỵet theo index
            System.out.printf("phàn tư tại vị trí index = %d là %d \n", i, array[i]);
        }
        // forEach : duyệt theo giá trị
        for (int valueArr : array) {
            System.out.println(valueArr);
        }
        // kiểm tra các số chia hết cho 2
        System.out.println("các phần tử chia hết cho 2");
        for (int arrValue : array) {
            if (arrValue % 2 == 0) {
                System.out.println(arrValue);
            }
        }
        // kiểm tra vị trí index các phần tử chia hết cho 2
        System.out.println("vị trí index các phần tử chia hết cho 2");
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value % 2 == 0) {
                System.out.println("vị trí index các phần tử chia hết cho 2 là :" + i);
            }
        }

        // mảng hai chiều là gì : mảng chứa danh sách các mảng khác
        int [][] array2Side = {{1,2,3},{5,6,7,8}};
        for (int[] arr: array2Side) {
            System.out.println(Arrays.toString(arr));
        }

//        int [][] arr2Side = new int[3][4];
        int [][] arr2Side = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int[] arr: arr2Side) {
            System.out.println(Arrays.toString(arr));
        }
        // duyệt theo ma tran
        for (int i = 0; i < arr2Side.length; i++) {
            for (int j = 0; j < arr2Side[i].length; j++) {
                System.out.printf("%2d ",arr2Side[i][j]);
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        // bài toán nhạp xuất dữ liệu mảng 2 chiều
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
        System.out.println("Các giá trị vừa nhập là");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-5d",matrix[i][j]);
            }
            System.out.println();
        }


    }
}
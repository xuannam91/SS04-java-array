package ra.bt09;

public class Main {
    public static void main(String[] args) {
//        Tìm phần tử lớn thứ 2 trong Mảng
        int[] arrayInt = {10,10, -4, 6, 8, 7, 5};
        int max1 = arrayInt[0];
        int max2 = Integer.MIN_VALUE; // Khởi tạo max2 với giá trị nhỏ nhất của kiểu int

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > max1) {
                max2 = max1; // Cập nhật max2 thành max1
                max1 = arrayInt[i]; // Cập nhật max1 thành giá trị mới
            } else if (arrayInt[i] > max2 && arrayInt[i] != max1) {
                max2 = arrayInt[i]; // Cập nhật max2 nếu giá trị mới lớn hơn max2 và không bằng max1
            }
        }

        System.out.println("Số lớn thứ nhất là: " + max1);
        System.out.println("Số lớn thứ hai là: " + max2);

    }
}

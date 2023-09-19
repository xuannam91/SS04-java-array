package ra.bt02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Thêm phần tử vào mảng.
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = {10,4,6,8,7,5};
        System.out.println("Nhập giá trị cần thêm");
        int varriable = sc.nextInt();
        System.out.println("Nhập vào vị trí muốn thêm");
        int index = sc.nextInt();
        int[] newArr = Arrays.copyOf(arrayInt,arrayInt.length + 1);
        newArr[index] = varriable;
        for (int i = index + 1; i < newArr.length; i++){
            newArr[i] = arrayInt[i-1];
        }
        System.out.println(Arrays.toString(newArr));



    }
}
